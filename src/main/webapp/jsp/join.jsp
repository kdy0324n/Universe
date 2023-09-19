<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/join.css">
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript">
	function gopage() {
		var frmMember=document.frmMember;
		var id = frmMember.loginId.value;
		var pw = frmMember.loginPw.value;
		var name = frmMember.name.value;
		var email = frmMember.email.value;
		var nickname = frmMember.nickname.value;
		var cellphoneNo = frmMember.cellphoneNo.value;
		
		if(id.length==0 || id == ''){
			alert("아이디는 필수입니다.");
		}else if(pw.length==0 || pw==''){
			alert("비번은 필수 입니다.");
		}else if(name.length==0 || name==""){
			alert("이름은 필수 입니다.");
		}else if(email.length==0 || email==""){
			alert("이메일은 필수 입니다.");
		}else if(nickname.length==0 || nickname==""){
			alert("닉네임은 필수 입니다.");
		}else if(cellphoneNo.length==0 || cellphoneNo==""){
			alert("전화번호는 필수 입니다.");
		}else{
			frmMember.method="post";
			frmMember.action="../Insert";
			frmMember.submit();
		}
	}
</script>
</head>
<body>
	<form name="frmMember" action="doJoin" method="POST" class="joinForm" onsubmit="DoJoinForm__submit(this); return false;">
                                                                                               
      <h2>회원가입</h2>
      <div class="textForm">
        <input name="loginId" type="text" class="id" placeholder="아이디">
        </input>
      </div>
      <div class="textForm">
        <input name="loginPw" type="password" class="pw" placeholder="비밀번호">
      </div>
      <div class="textForm">
        <input name="name" type="text" class="name" placeholder="이름">
      </div>
       <div class="textForm">
        <input name="email" type="text" class="email" placeholder="이메일">
      </div>
      <div class="textForm">
        <input name="nickname" type="text" class="nickname" placeholder="닉네임">
      </div>
      <div class="textForm">
        <input name="cellphoneNo" type="number" class="cellphoneNo" placeholder="전화번호">
      </div>
      <input type="button" class="btn" value="J O I N" onclick="gopage()"/>
    </form>
</body>
</html>