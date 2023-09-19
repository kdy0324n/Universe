<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/login.css">
<link rel="shortcut icon" href="">
<script type="text/javascript">
	function goPage() {
		var frmMember=document.frm;
		var id = frmMember.id.value;
		var pw = frmMember.pwd.value;
		if(id.length==0 || id == ''){
			alert("아이디는 필수입니다.");
		}else if(pw.length==0 || pw==''){
			alert("비번은 필수 입니다.");
		}else{
			frmMember.method="post";
			frmMember.action="../Login";
			frmMember.submit();
		}
	}
</script>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<form name="frm" class="loginForm">
      <h2>Login</h2>
      <div class="idForm">
        <input type="text" name="id" class="id" placeholder="ID">
      </div>
      <div class="passForm">
        <input type="password" name="pwd" class="pw" placeholder="PW">
      </div>
      <button type="button" class="btn" onclick="goPage()">
        LOG IN
      </button>
      
      
      <div class="bottomText">
        Don't you have ID? <a href="join.jsp">sign up</a>
      </div>
    </form>
</body>
</html>