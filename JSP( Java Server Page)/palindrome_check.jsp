<%!
String r, n;
%>
<%
if(request.getParameter("result") != null)
{
    r = request.getParameter("result");
    n = request.getParameter("n");
} else {
    r = "";
    n = "";
}
%>



<html>
    <head>
        <title>JSP Redirect Response</title>
    </head>
    <body>
        <h2>Palindrome Check</h2>
        <form name="Palindrome", method="post", action="palindrome_show.jsp">
            <table border="1", width="50%">
                <tr>
                    <td>Enter a number :</td>
                    <td><input type="text", name="t1" required></td>
                </tr>
                <tr>
                    <td colspan="2", align="center"><input type="submit", name="submit", value="submit"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
