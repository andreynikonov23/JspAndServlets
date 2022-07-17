<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
	<body>
		<%
			String name = request.getParameter("name");
			if (name == null){
				name = " ";
			} else{
				name = ", " + name;
			}
		%>
		<h1>
			Hello <%=name %>
		</h1>
	</body>
</html>
