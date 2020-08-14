<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>      
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>New Policy</title>
</head>
<body>
    <div align="center">
        <h2>New Policy</h2>
        <form:form action="savepolicy" method="post" modelAttribute="policy">
            <table border="0" cellpadding="5">
                <tr>
                    <td>Policy Type: </td>
                    <td><form:input path="type" /></td>
                </tr>
                <tr>
                    <td>Policy Time period: </td>
                    <td><form:input path="time_period" /></td>
                </tr>
                
                <tr>
                    <td colspan="2"><input type="submit" value="Save"></td>
                </tr>                    
            </table>
        </form:form>
    </div>
</body>
</html>
