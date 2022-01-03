<!DOCTYPE html>
<html lang="en" >
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<center>
<h2>Employee details</h2>
<b>
<table style="width:350px;height:300px;background-color:green;border-radius:20px;">
<tr>
<td>
Empid:</td><td> <%=request.getParameter("empid")%></td></tr>
<tr>
<td>
Name: </td><td><%=request.getParameter("name")%></td></tr>
<tr>
<td>
Designation: </td><td><%=request.getParameter("designation")%></td></tr>
<tr>
<td>
Salary: </td><td><%=request.getParameter("salary")%></td></tr>
<tr>
<td>
Address: </td><td><%=request.getParameter("address")%></td></tr>
<tr>
<td>
BloodGroup: </td><td><%=request.getParameter("bloodgroup")%></td></tr>
<tr>
<td>
NoOfLeaves: </td><td><%=request.getParameter("noofleaves")%></td></tr>
<tr>
<td>
ProjectAssigned: </td><td><%=request.getParameter("projectassigned")%></td></tr>

</table>
</b>
</center>

</body>
</html>