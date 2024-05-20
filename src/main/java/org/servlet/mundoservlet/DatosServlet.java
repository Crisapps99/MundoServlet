package org.servlet.mundoservlet;
/*
 * Nombre del programador: Cristian Sandoval
 * Materia: Programacion 2
 * Fecha: 16/05/2024
 * Detalle: esta clase es el que almacena los datos enviados desde mi html e imprime todos los datos
 * Versión:
 ***/

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


import java.io.IOException;
import java.io.PrintWriter;

//creamos la llaves
@WebServlet("/DatosServlet")
public class DatosServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        //responde
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");

        //defino la vsariable
        String nom = req.getParameter("nombre");
        String ape = req.getParameter("apellido");
        String edad1 = req.getParameter("Edad");
        String nive = req.getParameter("Nivel");
        String gene = req.getParameter("genero");
        String len = req.getParameter("lenguaje");
        String des = req.getParameter("texto");
        PrintWriter out = resp.getWriter();

        //condicion para verificar si lso datos etsan vacios
        if (nom == null || ape == null || edad1 == null || nive == null || gene == null || len == null || des == null ||
                // isEmpty verifica si la variable nom que almacena el valor del campo nombre del formulario
                //esta vacia es decir si su longitud es igual a cero si esta vacio esto devuelve true
                nom.isEmpty() || ape.isEmpty() || edad1.isEmpty() || nive.isEmpty() || gene.isEmpty() || len.isEmpty() || des.isEmpty()) {
            //si almenos unos de lso campos esta vacio enviar un mensaje de error y terminar la ejecucion
            out.print("<!DOCTYPE html>");
            out.print("<html>");
            out.print("<head>");
            out.print("<title> Datos </title>");
            out.print("<meta charset=\"UTF-8\">");
            out.print("<link rel=\"stylesheet\" href=\"estilos.css\">");
            out.print("</head>");
            out.print("<body>");
            out.print("<div class=\"form\">");
            out.print("<div class=\"title\">");
            out.print(" <h2><label style=\"text-align: center; color: red;\">Error</label></h2>");
            out.print("</div>");
            out.println("<h2>Por favor, ingrese datos en todos los campos.</h2>");
            //este boton me permite retroceder
            out.println("<input type=\"button\" value=\"Retroceder\" class=\"btn\" onclick=\"window.history.back()\"/>");
            out.print("</div>");
            out.print("</body>");
            out.print("</html>");
            //terminamos la ejecucion del metodo doPost
            return;
            //else me dice si todos los datos estan completos continua con el procesamiento de los datos
        }   else {
            // convierto la edad en entero
            int ed = Integer.parseInt(edad1);

            //imprimo lso datos por consola para verificar si se envian lso datos desde el formulario
            System.out.println("nombre: " + nom);
            System.out.println("apellido: " + ape);
            System.out.println("Edad: " + edad1);
            System.out.println("nivel: " + nive);
            System.out.println("genero: " + gene);
            System.out.println("Lenguaje: " + len);
            System.out.println("Descripcion: " + des);


            //imprimimos los datos enviados desde el html al servlet con el metodo post
            out.print("<!DOCTYPE html>");
            out.print("<html>");
            out.print("<head>");
            out.print("<title> Datos </title>");
            out.print("<meta charset=\"UTF-8\">");
            out.print("<link rel=\"stylesheet\" href=\"estilos.css\">");
            out.print("</head>");
            out.print("<body>");
            out.print("<div class=\"form\">");
            out.print("<div class=\"title\">");
            out.print(" <h2><label style=\"text-align: center;\">Datos Servlet</label></h2>");
            out.print("</div>");
            out.print("<h3>Nombre : </h3>" + nom);
            out.print("<h3>Apellido : </h3>" + ape);
            out.print("<h3>Edad : </h3>" + edad1);
            out.println("<h3>Nivel : </h3>" + nive);
            out.println("<h3>Genero : </h3>" + gene);
            out.println("<h3>Lenguaje de programacion preferido </h3>" + len);
            out.println("<h3>Descripción : </h3>" + des);
            //este boton me permite retroceder
            out.println("<input type=\"button\" value=\"Retroceder\" class=\"btn\" onclick=\"window.history.back()\"/>");

            out.print("</div>");
            out.print("</body>");

            out.print("</html>");
        }



        }

    }

