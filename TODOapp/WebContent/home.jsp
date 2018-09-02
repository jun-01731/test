<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/style.css">
<script>

function goDeleteAction(element){
	var id_value = element.id;
	var id = document.getElementById('selectedId0').value=id_value;
	alert(id);
}
</script>
<title>todo</title>

</head>
<body>
<h1>HELLO TODO</h1>
<s:form action="CreateTodoAction">
	<s:textfield name="todo" size="50" placeholder="what to do"/>
	<s:submit id="add" value="Add"/>
</s:form>


<s:form id="delete-form" action="DeleteAction">
<table>
<s:iterator value="todoList" status="st">
<tr>
	<td><s:property value="todo" /><s:hidden name="delete" id="selectedId%{#st.index}" value=""/><td>
	<td><td><s:submit id="%{#st.index}" value="complete" class="submit_btn_mini" onclick="goDeleteAction(this);"/></td>
</tr>
</s:iterator>
</table>
</s:form>




</body>
</html>