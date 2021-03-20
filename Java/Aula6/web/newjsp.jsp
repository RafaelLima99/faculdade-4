<%-- 
    Document   : newjsp
    Created on : 18/03/2021, 17:01:49
    Author     : Rafael Lima
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <ul>
            <!--No meio das tags ‹ul› temos um Scriptlet, iniciado com ‹% e terminado
            com %›, tratando de código Java que será executado no Servidor. -->
            <%
            //Nesse código, temos a definição de um vetor de cores, as quais 
            //impressas no conteúdo da página através do objeto out, 
            //implícito nas páginas JSP.
            String[] cores = {"vermelho","verde","azul"};
                
                for(String x: cores) {
                out.println("<li>"+x+"</li>");
              }
            %>
        </ul>
    </body>
</html>
