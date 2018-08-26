<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Content-Style-Type" content="text/css"/>
<meta http-equiv="Content-Script-Type" content="text/javascript"/>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>


<title>商品登録確認画面</title>

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
	<script type="text/javascript">
		function submitAction(url){
			alert(url);
			$('form').attr('action', url);
			$('form').submit();
		}
	</script>

</head>
<body>
<div id="header">
</div>
	<div id="main">
		<div id="top">
			<p>Product Registration Confirm</p>
		</div>

			<h3>登録内容はこちらでよろしいですか</h3>

	<s:form action="ProductAddCompleteAction">
	<tr>
		<td>商品名</td>
		<td>
			<s:property value="itemName" escape="false"/>
			<%
			//<input type="hidden" name="itemName" value="itemName"/>
			%>
		</td>
	</tr>
	<tr>
		<td>値段</td>
		<td>
			<s:property value="itemPrice" escape="false"/>
			<input type="hidden" name="itemPrice" value="itemPrice"/><span>円</span>
		</td>
	</tr>
	<tr>
		<td>在庫</td>
		<td>
			<s:property value="stock" escape="false"/>
			<input type="hidden" name="stock" value="stock"/><span>個</span>
		</td>
	</tr>

	<tr>

		<td><s:submit value="完了"/></td>




	</s:form>

	</div>

<div id="footer">
</div>




</body>
</html>