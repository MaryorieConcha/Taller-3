public class Vendedor extends Persona {
	private String tituloProfesional;
	private EstadoCivil estadoCivil;

	public Vendedor(String nombre, String rut, String direccion, String tituloProfesional, EstadoCivil estadoCivil) {
		super(nombre, rut, direccion);
		this.tituloProfesional = tituloProfesional;
		this.estadoCivil = estadoCivil;
	}

	public String getTituloProfesional() {
		return this.tituloProfesional;
	}

	public void setTituloProfesional(String tituloProfesional) {
		this.tituloProfesional = tituloProfesional;
	}

	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	@Override
	public String toString() {
		return "Vendedor{Nombre: "+super.getNombre()+", Rut: "+super.getRut()+", Dirección: "+super.getDireccion()+"}"+
				"tituloProfesional:"+this.tituloProfesional+", estadoCivil:"+this.estadoCivil+'}';
	}
}