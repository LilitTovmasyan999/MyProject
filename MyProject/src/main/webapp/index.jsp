<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>My Project</title>
</head>
<body>



<h1 style="color: red;">
    <%
        String answer = (String) session.getAttribute("answer");
        out.print(answer);
    %>
  </h1>
</body>
</html>
