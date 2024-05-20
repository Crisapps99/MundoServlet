package org.servlet.mundoservlet;
/*
 * Nombre del programador: Cristian Sandoval
 * Materia: Programacion 2
 * Fecha: 16/05/2024
 * Detalle:
 * Versión:
 ***/
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

// creamos la llaves
@WebServlet("/servletParametro")

public class ParametrosGetServlet extends HttpServlet {
    @Override

    //metodo doGet
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws  IOException {
        //responde con el resp.setcontentype de tipo text/html
        resp.setContentType("text/html");
        //defirno variable
        PrintWriter out=resp.getWriter();

        String saludo=req.getParameter("saludo");
        String numero1=req.getParameter("num");

        int num2=Integer.parseInt(numero1);

        out.print("<h1> numero get </h1>"+num2);
        out.print("<h1> parametro get</h1>"+saludo);


    }
}
