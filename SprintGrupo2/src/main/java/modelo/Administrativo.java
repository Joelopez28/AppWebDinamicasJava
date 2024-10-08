package modelo;

public class Administrativo  extends Usuario{
    private String area;
    private String experienciaPrevia;
    
  
	public Administrativo(String nombre, String fechaDeNacimiento, String run, String tipo, String area,
			String experienciaPrevia) {
		super(nombre, fechaDeNacimiento, run, tipo);
		this.area = area;
		this.experienciaPrevia = experienciaPrevia;
	}


	public String getArea() {
		return area;
	}


	public void setArea(String area) {
		this.area = area;
	}


	public String getExperienciaPrevia() {
		return experienciaPrevia;
	}


	public void setExperienciaPrevia(String experienciaPrevia) {
		this.experienciaPrevia = experienciaPrevia;
	}


	@Override
	public String toString() {
		return "Administrativo [area=" + area + ", experienciaPrevia=" + experienciaPrevia + "]";
	}
    


}


