package modelo;

public class Profesional extends Usuario{
	private String titulo;
	private String fechaIngreso;
	
	
	public Profesional(String nombre, String fechaDeNacimiento, String run, String tipo, String titulo, String fechaIngreso) {
		super(nombre, fechaDeNacimiento, run, tipo);
		this.titulo = titulo;
		this.fechaIngreso = fechaIngreso;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getFechaIngreso() {
		return fechaIngreso;
	}


	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}


	@Override
	public String toString() {
		return "Profesional [titulo=" + titulo + ", fechaIngreso=" + fechaIngreso + "]";
	}
	

}
