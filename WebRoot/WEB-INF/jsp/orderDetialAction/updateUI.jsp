<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    
    <title>My JSP 'list.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	

  </head>
  
  <body>
    	<form action="orderDetialAction_update.action?orderId=${orderId}">
    		<s:hidden name="id"/><br>
    		<s:textfield name="name"/><br>
    		<s:textfield name="productDate"/><br>
    		<s:hidden name="orderId"/>
    		<input type="submit" value="提交">
    		
    	</form>
  </body>
</html>