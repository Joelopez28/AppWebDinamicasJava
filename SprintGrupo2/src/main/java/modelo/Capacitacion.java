package modelo;

public class Capacitacion {
	private String nombreCapacitacion;
	private String detalle;
	    
	public Capacitacion() {
		super();
	}

	public Capacitacion(String nombre, String detalle) {
		super();
		this.nombreCapacitacion = nombre;
		this.detalle = detalle;
	}

	public String getNombreCapacitacion() {
		return nombreCapacitacion;
	}

	public void setNombreCapacitacion(String nombre) {
		this.nombreCapacitacion = nombre;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	@Override
	public String toString() {
		return "Capacitación {" +
        		"Nombre='" + nombreCapacitacion + '\'' +
        		", Detalle'" + detalle + '\'' +
                '}';
	}
}
