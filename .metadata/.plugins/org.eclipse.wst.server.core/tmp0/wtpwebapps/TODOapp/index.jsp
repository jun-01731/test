<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>TODO</title>
</head>
<body>
<h1>TODO</h1>
<s:form action="CreateTodoAction">
<input type="text" name="todo" size=50 placeholder="what to do">

	<%-- <s:textfield name="todo"/>--%>
	<s:submit value="Add"/>
</s:form>




</body>
</html>