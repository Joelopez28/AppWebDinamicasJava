package modelo;

public class Usuario {
	private String nombre;
	private String fechaDeNacimiento;
	private String run;
	private String tipo;
	
	
	public Usuario(String nombre, String fechaDeNacimiento, String run, String tipo) {
		super();
		this.nombre = nombre;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.run = run;
		this.tipo = tipo;
	}
	
	
	
	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}



	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	public void setFechaDeNacimiento(String fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	public String getRun() {
		return run;
	}
	public void setRun(String run) {
		this.run = run;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", fechaDeNacimiento=" + fechaDeNacimiento + ", run=" + run + ", tipo="
				+ tipo + "]";
	}
    
    



}