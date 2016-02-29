<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
    <sf:form method="POST" modelAttribute="loginInfo" action="/SpringMvcTest/onLogin">
    	<table>
    		<tr>
    			
    			<td><sf:input path="userId"/></td>
    		</tr>
    		<tr>
    			
    			<td><sf:password path="password"/></td>
    		</tr>
    		<tr>
    			<td colspan="2"><input type="submit" value="login"></td>
    		</tr>
    	</table>
    	
 	</sf:form>
	<h1>${error}</h1>
</body>
</html>