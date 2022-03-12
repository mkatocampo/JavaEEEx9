<%-- 
    Document   : bookSummary
    Created on : Jan 28, 2020, 8:23:04 AM
    Author     : Chris.Cusack

    The view for the process book
    Support
    -Create
    -Saving changes
    -Delete
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="edu.nbcc.model.*"%>

<!DOCTYPE html>
<html>
    <head>
        <%@include file="WEB-INF/jspf/header.jspf" %>
        <title>Book</title>
    </head>
    <body class="p-4">
        <%@include file="WEB-INF/jspf/navigation.jspf" %>
        <h1>Book Summary</h1>
        	<%
        	Book deletedBook = null;
    		Book savedBook = null;
    		Book createdBook = null;
    		
    		if (request.getAttribute("deletedBook") != null){
    			deletedBook = (Book)request.getAttribute("deletedBook");
    		}
    		
			if (request.getAttribute("savedBook") != null){
    			savedBook = (Book)request.getAttribute("savedBook");
			}
			
			if (request.getAttribute("createdBook") != null){
    			createdBook = (Book)request.getAttribute("createdBook");
			}
			
			Book book = null;
				
			if (deletedBook != null){%>
			<h2><%=deletedBook.getName()%> Id: <%=deletedBook.getId()%> has been deleted </h2>
			<%
			} else if (savedBook != null || createdBook != null){
				if (savedBook != null){
					book = savedBook;
				}
				if (createdBook != null){
					book = createdBook;
				}	
			%>
 
    	    <table class="table table-striped">                   
                    <tr>
                        <th>
                            Id
                        </th>
                        <th>
                            Name
                        </th> 
                        <th>
                            Price
                        </th>
                        <th>
                            Term
                        </th>
                    </tr>
                    <tr>
                        <td><%=book.getId()%></td>
                        <td><%=book.getName()%></td>
						<td><%=book.getPrice()%></td>
						<td><%=book.getTerm()%></td>
                    </tr>
                </table>
    	   <%}else{ %>
    	   <a href="${pageContext.request.contextPath}/books">books</a>
      <%}%>
       
    </body>
</html>
