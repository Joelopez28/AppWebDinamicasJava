package modelo;

public class Cliente extends Usuario{
    private String nombreCliente;
    private String apellidoCliente;
    private String telefono;
    private String direccion;
    private String edad;
    
    
	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cliente(String nombre, String fechaDeNacimiento, String run, String tipo, String nombreCliente,
			String apellidoCliente, String telefono, String direccion, String edad) {
		super(nombre, fechaDeNacimiento, run, tipo);
		this.nombreCliente = nombreCliente;
		this.apellidoCliente = apellidoCliente;
		this.telefono = telefono;
		this.direccion = direccion;
		this.edad = edad;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getApellidoCliente() {
		return apellidoCliente;
	}

	public void setApellidoCliente(String apellidoCliente) {
		this.apellidoCliente = apellidoCliente;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Cliente [nombreCliente=" + nombreCliente + ", apellidoCliente=" + apellidoCliente + ", telefono="
				+ telefono + ", direccion=" + direccion + ", edad=" + edad + "]";
	}

	
}
