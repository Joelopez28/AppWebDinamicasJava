package modelo;

public class Contacto {
	
	private String nombre;
	private String correo;
	private String consulta;
	
	
	public Contacto(String nombre, String correo, String consulta) {
		this.nombre = nombre;
		this.correo = correo;
		this.consulta = consulta;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getCorreo() {
		return correo;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}


	public String getConsulta() {
		return consulta;
	}


	public void setConsulta(String consulta) {
		this.consulta = consulta;
	}


	@Override
	public String toString() {
		return "Contacto [nombre=" + nombre + ", correo=" + correo + ", consulta=" + consulta + "]";
	}
	
	
}
