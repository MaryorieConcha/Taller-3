public class Inmueble {
	private TipoDeConstruccion tipoDeConstruccion;
	private String ciudad;
	private String direccion;
	private double precio;

	public Inmueble(TipoDeConstruccion tipoDeConstruccion, String ciudad, String direccion, double precio) {
		this.tipoDeConstruccion = tipoDeConstruccion;
		this.ciudad = ciudad;
		this.direccion = direccion;
		this.precio = precio;
	}

	public String getCiudad() {
		return this.ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public double getPrecio() {
		return this.precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Inmueble{TipoDeConstruccion:"+this.tipoDeConstruccion+", Ubicación Geografica:"+"[Ciudad:"+this.ciudad+", direccion:"+this.direccion+ "], precio:"+this.precio+'}';
	}
}