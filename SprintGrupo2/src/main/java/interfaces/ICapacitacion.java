package interfaces;

import modelo.Capacitacion;
import java.util.List;

public interface ICapacitacion {
    List<Capacitacion> listarCapacitaciones();
    void registrarCapacitacion(Capacitacion capacitacion);
}
