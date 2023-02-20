package br.ada.americanas.formulariocadastroservlet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CadastroServlet", value = "/cadastro")
public class CadastroServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String name = request.getParameter("name");
    String cpf = request.getParameter("cpf");
        PrintWriter write = response.getWriter();
        write.println("<html><body> ");
        write.println("<h1> DADOS CADASTROS COM SUCESSO: </h1>");
        write.println("<p> nome:"+ name + "</p>");
        write.println("<p> CPF:"+ cpf + "</p>");
        write.println("</html></body>");

    }
}
