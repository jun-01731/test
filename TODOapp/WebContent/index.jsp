<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/style.css">
<%--0秒後にHomeActionが呼ばれる --%>
<meta http-equiv="refresh" content="0;URL='HomeAction'"/>

<title>todo</title>

</head>
<body>
<h1>HELLO TODO</h1>
<s:form action="CreateTodoAction">
	<s:textfield name="todo" size="50" placeholder="what to do"/>
	<s:submit value="Add"/>
</s:form>

<s:iterator value="todoList">
	<s:property value="todo"/><br>
</s:iterator>


</body>
</html>