<!--<html>
    <head>
        <title>JSP Example</title>
    </head>
    <body>
        <h1>Welcome to My JSP Page</h1>
        <p>Current Time: <%= new java.util.Date() %></p>
    </body>
</html> -->

<html>
    <head>
        <title>
            JSP Web Server Page
        </title>
    </head>
    <body>
        <%
            // Correctly format the HTML content within the `out.println` statement.
            out.println("<font size='+2' color='red'><h1>Hello World</h1></font>");
        %>
    </body>
</html>

