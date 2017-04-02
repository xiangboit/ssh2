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
    	<table border="1px" align="center" width="500px" height="250px">
    		<tr align="center">
    			<td>id</td>
    			<td>name</td>
    			<td>ordersDate</td>
    		</tr>
    		<s:iterator value="#orderlist">
    			<tr align="center">
	    			<td>
		    			<a href="orderDetialAction_list.action?orderId=${id}">${id}</a>
	    			</td>
	    			<td>${name}</td>
	    			<td>${ordersDate}</td>
	    		</tr>
    		</s:iterator>
    	</table>
  </body>
</html>
