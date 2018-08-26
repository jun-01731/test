<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Content-Style-Type" content="text/css"/>

<title>商品登録画面</title>

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
		clear:both;
	}
	</style>
</head>
<body>
	<div id="header">
	</div>
	<div id="main">
		<div id="top">
			<p>Product Registration</p>
		</div>
		<table>
		<s:form action="ProductAddConfirmAction">
			<tr>
				<td><label>商品名</label></td>
				<td><s:textfield name="itemName"/></td>
			</tr>
			<tr>
				<td><label>値段</label></td>
				<td><s:textfield name="itemPrice"/></td>
			</tr>
			<tr>
			<td><label>在庫</label></td>
			<td><s:textfield name="stock"/></td>
			</tr>
			<s:submit value="登録"/>
		</s:form>
		</table>

	</div>

	<div id="footer">
	</div>



</body>
</html>