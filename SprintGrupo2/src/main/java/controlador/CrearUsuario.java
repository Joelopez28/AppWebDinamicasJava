package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import implementacion.UsuarioImpl;
import implementacion.ClienteImpl;
import interfaces.IUsuario;
import interfaces.ICliente;
import modelo.Cliente;
import modelo.Usuario;

/**
 * Servlet implementation class CrearUsuario
 */
@WebServlet("/formulariousr")
public class CrearUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CrearUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		getServletContext().getRequestDispatcher("/views/formulariousr.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
 
        String nombre = request.getParameter("nombre");
        String fechaDeNacimiento = request.getParameter("fechaNacimiento");
        String run = request.getParameter("run");
        String tipo = request.getParameter("userType");

        
        Usuario usuario = new Usuario();
        usuario.setNombre(nombre);
        usuario.setFechaDeNacimiento(fechaDeNacimiento);
        usuario.setRun(run);
        usuario.setTipo(tipo);

        IUsuario dao = new UsuarioImpl();
        dao.registrarUsuario(usuario);
		
        // Redirigir al formulario correspondiente basado en el tipo de usuario
        if ("Cliente".equalsIgnoreCase(tipo)) {
        	
            String nombreCliente = request.getParameter("nombreCliente");
            String apellidoCliente = request.getParameter("apellidoCliente");
            String telefono = request.getParameter("telefono");
            String direccion = request.getParameter("direccion");
            String edad = request.getParameter("edad");

            
            Cliente cliente = new Cliente();
            cliente.setNombreCliente(nombreCliente);
            cliente.setApellidoCliente(apellidoCliente);
            cliente.setTelefono(telefono);
            cliente.setDireccion(direccion);
            cliente.setEdad(edad);

            ICliente daoCliente = new ClienteImpl();
            daoCliente.registrarCliente(cliente);
            
            response.sendRedirect(request.getContextPath() + "/views/formulariocliente.jsp");
        } else if ("Administrativo".equalsIgnoreCase(tipo)) {
            response.sendRedirect(request.getContextPath() + "/views/formularioadmin.jsp"); // Asegúrate de tener este archivo JSP
        } else if ("Profesional".equalsIgnoreCase(tipo)) {
            response.sendRedirect(request.getContextPath() + "/views/formularioprofesional.jsp"); // Asegúrate de tener este archivo JSP
        } else {
            // Si no se selecciona un tipo válido, redirigir de nuevo al formulario de usuario
            response.sendRedirect(request.getContextPath() + "/views/formulariousr.jsp");
        }
    }
}
