<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ユーザー追加画面</title>
<style type="text/css">
	body{
		margin:0;
		padding:0;
		line-height:1.6;
		letter-spacing:1px;
		font-family:Verdana, Helvetica, sans-serif;
		font-size:12px;
		color:#333;
		background:#fff;
		}

	table{
		text-align:center;
		margin:0 auto;
		}

	#top{
		width:780px;
		margin:30px auto;
		border:1px solid #333;
		}

	#header{
		width:100%;
		height:80px;
		background-color:black;
		}

	#main{
		width:100%;
		height:500px;
		text-align:center;
		}

	#footer{
		width:100%;
		height:80px;
		background-color:black;
		claer:both;
		}

</style>
</head>
<body>
<div id="header">
		<div id="pr">
		</div>
	</div>
	<div id="main">
		<div id="top">
			<p>userAdd</p>
		</div>

		<table>
		<s:form action="UserAddConfirmAction">
			<tr>
				<td><label>ログインID</label></td>
				<td><s:textfield name="loginId"/></td>
			</tr>
			<tr>
				<td><label>ログインPASS</label></td>
				<td><s:textfield name="loginPass"/></td>
			</tr>
			<tr>
			<td><label>ユーザー名</label></td>
			<td><s:textfield name="userName"/></td>
			</tr>
			<s:submit value="追加"/>
		</s:form>
		</table>






	</div>
	<div id="footer">
		<div id="pr">
		</div>
	</div>

</body>
</html>