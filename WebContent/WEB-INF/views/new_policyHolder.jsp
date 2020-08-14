<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>      
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>New Policy Holder</title>
</head>
<body>
    <div align="center">
        <h2>New Policy Holder</h2>
        <form:form action="savepolicyholder" method="post" modelAttribute="policyHolder">
            <table border="0" cellpadding="5">
                <tr>
                    <td>First Name: </td>
                    <td><form:input path="firstname" /></td>
                </tr>
                <tr>
                    <td>Middle Initial: </td>
                    <td><form:input path="middleinitial" /></td>
                </tr>
                <tr>
                    <td>Last Name: </td>
                    <td><form:input path="lastname" /></td>
                </tr>
                <tr>
                    <td>Date of Birth: </td>
                    <td><form:input path="dateOfBirth" /></td>
                </tr>
                <tr>
                    <td>Password: </td>
                    <td><form:input path="password" /></td>
                </tr>
                <tr>
                    <td>Email Address: </td>
                    <td><form:input path="emailaddress" /></td>
                </tr> 
                <tr>
                    <td>Policy Key: </td>
                    <td><form:input path="policy_key" /></td>
                </tr>       
                <tr>
                    <td colspan="2"><input type="submit" value="Save"></td>
                </tr>                    
            </table>
        </form:form>
    </div>
</body>
</html>
