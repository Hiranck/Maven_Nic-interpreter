<%@page import="nicSample.NicId"%>
<%@page import="nicSample.NicInterpreter"%>
<%@page import="nicSample.InvalidNicPropException"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>NIC INTERPRETER</title>
    
    </head>
            <body>

        <h1>Result of the Nic interpretation</h1>
        <%
	String id = request.getParameter("nicNumber");

	//out.println(id.length());
	NicInterpreter nicInterpreter = new NicInterpreter();
	
	try {
		NicId nicId = nicInterpreter.createNicId(id);
		nicInterpreter.interprete(nicId);
                String text = nicInterpreter.toString();
		out.println(text);
	} catch (InvalidNicPropException ex) {
		out.println(ex.getMessage());
	}	
        %>
        <form action="index.jsp" method="post">
			
			<input type="submit" value="Back">
	</form>
         
    
        </body>
</html>
