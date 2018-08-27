<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>todo</title>
</head>
<body>
<h1>HELLO TODO</h1>
<s:form action="CreateTodoAction">
	<s:textfield name="todo" size="50" placeholder="what to do"/>
	<s:submit value="Add"/>
</s:form>

<s:iterator value="todoList">
	<s:property value="todo"/>
</s:iterator>

</body>
</html>