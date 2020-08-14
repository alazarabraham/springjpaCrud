	<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01
    Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Agent Manager</title>
</head>
<body>
<div align="center">
    <h2>Policy Manager</h2>
    <form method="get" action="search">
        <input type="text" name="keyword" /> &nbsp;
        <input type="submit" value="Search" />
    </form>
    <h3><a href="/InsuranceManager/newpolicy">New Policy</a></h3>
    <table border="1" cellpadding="5">
        <tr>
            <th>Policy Key</th>
            <th>Policy Type</th>
            <th>Policy Time Period</th>
          
        </tr>
        <c:forEach items="${listPolicy}" var="policy">
        <tr>
            <td>${policy.policy_key}</td>
            <td>${policy.type}</td>
            <td>${policy.time_period}</td>S
            <td>
                <a href="/InsuranceManager/editpolicy?policy_key=${policy.policy_key}">Edit</a>
                &nbsp;&nbsp;&nbsp;
                <a href="/InsuranceManager/deletepolicy?policy_key=${policy.policy_key}">Delete</a>
            </td>
        </tr>
        </c:forEach>
    </table>
</div>   
</body>
</html>