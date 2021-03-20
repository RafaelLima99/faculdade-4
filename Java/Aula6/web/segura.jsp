<%-- 
    Document   : segura
    Created on : 18/03/2021, 19:48:58
    Author     : Rafael Lima
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    //verifica se as sessoes existe
   if(session.getAttribute("usuario")==null)
       //se não existir vai para tela de login
    response.sendRedirect("Login.jsp");
     else {
     %>
     ‹!DOCTYPE html›
   ‹html›
   ‹body›
      ‹h1›Esta é uma página protegida!‹/h1›
      &O usuário <%=session.getAttribute("usuario")%>
      está logado.<br/>
      Para desconectar clique
      <a href="ServletLogin?acao=desconectar">aqui</a>
 ‹/body›
‹/html›
<% } %>