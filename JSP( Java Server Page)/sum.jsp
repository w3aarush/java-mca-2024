<%!
int a, b, c;
int sum(int x, int y)
{
    return(x+y);
}
%>
<html>
    <body>
        <%
        a = 10;
        b = 200;
        c = sum(a, b);
        %>
        <p>Value of a = <%=a %> and Value of b = <%= b %></p>
        <p>Sum = <%= c %></p>
    </body>
</html>