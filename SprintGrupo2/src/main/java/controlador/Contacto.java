package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Contacto
 */
@WebServlet("/Contacto")
public class Contacto extends HttpServlet {
    private static final long serialVersionUID = 1L;
       
    public Contacto() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/views/contacto.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Capturar los datos enviados desde el formulario
        String nombre = request.getParameter("nombre");
        String correo = request.getParameter("correo");
        String consulta = request.getParameter("consulta");
        
        // Validar si los datos fueron capturados correctamente
        if (nombre == null || correo == null || consulta == null || 
            nombre.isEmpty() || correo.isEmpty() || consulta.isEmpty()) {
            System.out.println("No se recibieron los datos correctamente.");
            request.setAttribute("errorMensaje", "Por favor, complete todos los campos.");
            getServletContext().getRequestDispatcher("/views/contacto.jsp").forward(request, response);
            return;
        }
        
        // Mostrar los datos en la consola
        mostrarDatosEnConsola(nombre, correo, consulta);
        
        // Establecer un mensaje de éxito en la request
        request.setAttribute("mensajeExito", "El mensaje ha sido enviado correctamente.");
        
        // Redirigir nuevamente al JSP del formulario de contacto
        getServletContext().getRequestDispatcher("/views/contacto.jsp").forward(request, response);
    }

    // Método que muestra los datos ingresados en la consola
    private void mostrarDatosEnConsola(String nombre, String correo, String consulta) {
        System.out.println("Contacto recibido:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Email: " + correo);
        System.out.println("Asunto: " + consulta);
    }
}
