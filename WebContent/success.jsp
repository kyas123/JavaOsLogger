<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>OS Log</title>
</head>
<body>
Name: <s:property value="osName"/><br/>
Version: <s:property value="version"/><br/>
Notes: <s:property value="notes"/><br/>
<a href="http://localhost:8080/HelloWorld/">Back to entry page</a>
</body>
</html>