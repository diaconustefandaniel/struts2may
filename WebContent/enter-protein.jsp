<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="s" uri="/struts-tags" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Enter protein</h1>

<s:form>
<s:textfield name="enterProtein"></s:textfield>
<s:submit value="Enter"/>

</s:form>

<div>Last amount entered:<s:property value="enterProtein"/></div>
<div>Total protein consumed this day :<s:property value="proteinData.total"/></div>


<div>
<s:i18n name="enterProteins">
    <s:text name="goal.text" /> <s:property value="proteinData.goal"/>
</s:i18n>

<a href="<s:url action="editGoal" />">Edit Goal</a>

</div>

<div>
<s:form action="submitProteins">
<s:textfield></s:textfield>
<s:submit value="Push it"/>
</s:form>

</div>

<s:if test="%{proteinData.total >= proteinData.goal}">
	<s:property value="resetTotal()"/>

</s:if>




</body>
</html>