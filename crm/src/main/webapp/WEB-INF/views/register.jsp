<html>
<head>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<%@taglib  uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<%@taglib  uri="http://www.springframework.org/tags/form"  prefix="form" %>
	
</head>
<body>

<c:if test="${message ne  null}">
  <c:out value="${message}"/>
</c:if>

<h3>Customer Registration Page</h3>
<hr>

<form:form  action="save"  method="post"  modelAttribute="custBean">
 <table>
 	<tr>
     <td>FirstName</td> <td><form:input path="firstName"/></td> 
     <td style="color: red;"><form:errors path="firstName"/></td>
   </tr>
   <tr>
     <td>Email</td> <td><form:input path="email"/></td> <td style="color: red;"><form:errors path="email"/></td>
   </tr>
   <tr>
   	<td>Password</td> <td><form:input path="password"/></td>
   	<td style="color: red;"><form:errors path="password"/></td>
   </tr>
   <tr>
     <td>Contact Number</td> <td><form:input path="mobile"/></td> <td style="color: red;"><form:errors path="mobile"/></td>
   </tr>
   <tr>
     <td  colspan="3"  align="center">  <input type="submit"  value="SUBMIT"></td>
   </tr>     
 </table>
</form:form>  
</body>
</html>