	<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01
    Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Policy Holder Manager</title>
</head>
<body>
<div align="center">
    <h2>Policy Holder Manager</h2>
    <form method="get" action="search">
        <input type="text" name="keyword" /> &nbsp;
        <input type="submit" value="Search" />
    </form>
    <h3><a href="/InsuranceManager/new">New Agent</a></h3>
    <h3><a href="/InsuranceManager/policyindex">Policies</a></h3>
    
    <table border="1" cellpadding="5">
        <tr>
            <th>Policy Holder Id</th>
            <th>First Name</th>
            <th>Middle Initial</th>
            <th>Last Name</th>
            <th>Date of Birth</th>
            <th>Password</th>
            <th>Email Address</th>
            <th>Policy Key</th>
            
            
        </tr>
        <c:forEach items="${listPolicyHolder}" var="policyHolder">
        <tr>
            <td>${policyHolder.PH_key}</td>
            <td>${policyHolder.firstname}</td>
            <td>${policyHolder.middleinitial}</td>
            <td>${policyHolder.lastname}</td>
            <td>${policyHolder.dateOfBirth}</td>
            <td>${policyHolder.password}</td>
            <td>${policyHolder.emailaddress}</td>
            <td>${policyHolder.policy_key}</td>
            
            <td>
                <a href="/InsuranceManager/editpolicyholder?PH_key=${policyHolder.PH_key}">Edit</a>
                &nbsp;&nbsp;&nbsp;
                <a href="/InsuranceManager/deletepolicyholder?PH_key=${policyHolder.PH_key}">Delete</a>
            </td>
        </tr>
        </c:forEach>
    </table>
</div>   
</body>
</html>

