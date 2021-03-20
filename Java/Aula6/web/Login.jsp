<%-- 
    Document   : Login
    Created on : 18/03/2021, 19:55:55
    Author     : Rafael Lima
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <body>
        <h1>Acesso ao Sistema</h1>
        <form action="ServletLogin" method="post">
            <input type="hidden" name="acao" value="conectar"/>
            Login: <input type="text" name="login"/>
            Senha: <input type="password" name="senha"/>
            Senha: <input type="submit" value="login"/>
        </form>
      <%
          //verifica se existe erro
          //todo a logica de verificar se a senha e email esta certo e criar as
          //session esta no pacote servelets no arquivo ServeltLogin
        if(request.getAttribute("erro")!=null) {
      %>
      <!---Exibe o erro-->
      <hr/>Ocorreu um erro:<%=request.getAttribute("erro")%>
     <%
        }
     %>
    </body>
</html>
