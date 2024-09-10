package controlador;


import implementacion.CapacitacionImpl;
import interfaces.ICapacitacion;
import modelo.Capacitacion;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/formulariocap")
public class CrearCapacitacion extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public CrearCapacitacion() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/views/formulariocap.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nombre = request.getParameter("tema");
        String descripcion = request.getParameter("descripcion");

        Capacitacion capacitacion = new Capacitacion();
        capacitacion.setNombreCapacitacion(nombre);
        capacitacion.setDetalle(descripcion);

        ICapacitacion dao = new CapacitacionImpl();
        dao.registrarCapacitacion(capacitacion);

        request.setAttribute("mensaje", "Capacitación registrada exitosamente.");
        request.getRequestDispatcher("/views/mensajecap.jsp").forward(request, response);
    }
}

