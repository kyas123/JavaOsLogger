<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>OS Log</title>
</head>

<body>
	<h1>Operating System Log</h1>
	<s:form action="log" method="post">
		<label for="osName">Please enter your OS</label><br/>
		<s:textfield type="text" name="osName" align="center" size="75"/>
		<label for="version">Version</label><br/>
		<s:textfield type="text" name="version" align="center" size="75"/>
		<label for="notes">Notes</label><br/>
		<s:textfield type="text" name="notes" align="center" size="75" /><br/>
		<input type="submit" value="Enter into Database" style="height:500px; width:415px" />
	</s:form>
	
	
	
	
</body>
</html>