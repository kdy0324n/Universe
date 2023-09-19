package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

import dto.Userinfo;
import db.DBAction;

public class UserinfoDao {
	
	// 아이디와 비밀번호를 받아와서 중복체크
	public Userinfo idcheck(String id,String pw) throws Exception{
		Userinfo userinfo = null;
		//db관련 필요한 기능들 선언
		
		// db패키지에서 가져와 db연동
		Connection conn = DBAction.getInstance().getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		ResultSetMetaData rsmd = null;
		
		//db에서 membership테이블 돌리면서 확인
		String sql = "select * from membership";
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				//가져온 id,pw가 db에 존재하는지 확인
				if(rs.getString(1).equals(id)&&rs.getString(2).equals(pw)) {
					userinfo = new Userinfo().setId(rs.getString(1))
							.setPwd(rs.getString(2)).setName(rs.getString(3))
							.setNickname(rs.getString(4))
							.setEmail(rs.getString(5))
							.setPhonenumber(rs.getString(6));
					//만약 존재한다면 값을 넣은 userinfo를 반환
					return userinfo;
				}				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		//db에 id,pw가 중복되지 않을시 null값 반환
		return null;
	}
	//회원 정보를 가져와 db에 값 저장
	public void insert(Userinfo userinfo) {
		//db 연동을 위해 사전 준비
		Connection conn = DBAction.getInstance().getConnection();
		Statement stmt = null;
		//membership테이블에 받아온 회원정보 입력하기 위한 sql문 작성
		String sql = "insert into membership values('"+userinfo.getId()+"','"+userinfo.getPwd()+"',"
				+ "'"+userinfo.getName()+"','"+userinfo.getNickname()+"',"
						+ "'"+userinfo.getEmail()+"','"+userinfo.getPhonenumber()+"')";
		
		try {
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//db에 회원의 문의 사항 저장
	public void contact(String name,String email,String msg) {
		Connection conn = DBAction.getInstance().getConnection();
		Statement stmt = null;
		String sql = "insert into contact values('"+name+"','"+email+"','"+msg+"')";
		try {
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
