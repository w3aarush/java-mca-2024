<%!
int x, y, z, z1, z2, z3;
%>
<%
x = Integer.parseInt(request.getParameter("t1"));
y = Integer.parseInt(request.getParameter("t2"));
z = x + y;
z1 = x - y;
z2 = x * y;
z3 = x / y;
%>
<p>x = <%= x %></p>
<p>y = <%= y %></p>
<p>Sum = <%= z %></p>
<p>Subtration = <%= z1 %></p>
<p>Multiplication = <%= z2 %></p>
<p>Division = <%= z3 %></p>
<br>
<a href="arithmetic_operation.jsp">Back</a>