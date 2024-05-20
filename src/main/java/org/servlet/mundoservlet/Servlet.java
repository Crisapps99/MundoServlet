package org.servlet.mundoservlet;
//importamos un http servlet
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

//la llave del servlet
@WebServlet("/servlet")
public class Servlet extends HttpServlet {
    //indicamos el metodo a utilizat en el servlet
    //enviamos los datos mediante un link utilizamos el metodo get
    // si mandamos datos mediante link botones e imagenes utilizamos el metodo get
    // y si enviamos datos mediante un formulario se utilzia el metodo post

    @Override
    // HttpServletRequest para enviar informacion al servidor y el servidor nos envia la respuesta
    // mediante HttpServletResponse
    protected void doPost(HttpServletRequest peticion, HttpServletResponse respuesta)throws IOException {
        //seteo el tipo de contenido que va devolver el servidor
        //setContentType=lo que te devuelve el contenido
        respuesta.setContentType("text/html");
        //se define una variable de tipo Print Writerpara mostrar congtenido en pantalla
        //PrintWriter = nos muestra el contenido

        PrintWriter out = respuesta.getWriter();
        //mediante la variable out se imprime los datos


        out.print("<!DOCTYPE html>");
        out.print("<html>");
        out.print("<head>");
        out.print("<title>Servlet</title>");
        out.print("<meta charset=\"UTD-8\">");
        out.print("<title>Hola desde Servlet</title>");
        out.print("</head>");
        out.print("<body>");
        out.print("<h1>hola  mi soo </h1>");
        out.print("</body>");
        out.print("</html>");
    }
}
