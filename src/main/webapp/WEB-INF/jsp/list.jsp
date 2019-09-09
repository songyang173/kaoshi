<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<link href="css/index2.css" rel="stylesheet" type="text/css"/>
<script type="text/javascript" src="js/jquery-1.8.2.min.js">
</script>
<body>
	<h1 align="center" style="font-size: 30px">测试</h1>
	<hr>
	<!-- 通过form全部提交 -->
<form action="show.do" method="post">
	<textarea rows="10" cols="15" name="str"></textarea><br>
	<button>提交</button>
</form>

</body>
</html>