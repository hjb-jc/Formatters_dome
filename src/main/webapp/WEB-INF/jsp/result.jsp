<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>格式化后</h3>
<form:form modelAttribute="user" method="post" action="" >
    <table>
        <tr>
            <td>日期类型:</td>
            <td><form:input path="birthday"/></td>
        </tr>
        <tr>
            <td>整数类型:</td>
            <td><form:input path="total"/></td>
        </tr>
        <tr>
            <td>百分数类型:</td>
            <td><form:input path="discount"/></td>
        </tr>
        <tr>
            <td>货币类型:</td>
            <td><form:input path="money"/></td>
        </tr>
    </table>
</form:form>
</body>
</html>
