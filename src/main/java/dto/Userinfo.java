package dto;

public class Userinfo {
	private String id,pwd,name,nickname,email,phonenumber;

	public String getId() {
		return id;
	}

	public Userinfo setId(String id) {
		this.id = id;
		return this;
	}

	public String getPwd() {
		return pwd;
	}

	public Userinfo setPwd(String pwd) {
		this.pwd = pwd;
		return this;
	}

	public String getName() {
		return name;
	}

	public Userinfo setName(String name) {
		this.name = name;
		return this;
	}

	public String getNickname() {
		return nickname;
	}

	public Userinfo setNickname(String nickname) {
		this.nickname = nickname;
		return this;
	}

	public String getEmail() {
		return email;
	}

	public Userinfo setEmail(String email) {
		this.email = email;
		return this;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public Userinfo setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
		return this;
	}
}
