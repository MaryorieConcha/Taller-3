import java.util.ArrayList;

public class Inmobiliaria {
	public ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	public ArrayList<Inmueble> inmuebles = new ArrayList<Inmueble>();
	public ArrayList<Vendedor> vendedores = new ArrayList<Vendedor>();

	public Cliente buscarCliente (String rut){
		for (Cliente cliente : this.clientes){
			if (cliente.getRut().equals(rut)){
				return cliente;
			}
		}
		return null;
	}

	public Vendedor buscarVendedor (String rut){
		for (Vendedor vendedor : this.vendedores){
			if (vendedor.getRut().equals(rut)){
				return vendedor;
			}
		}
		return null;
	}

	public boolean agregarClientes(Cliente cliente, String rut) {
		if (buscarCliente(rut) == null){
			this.clientes.add(cliente);
			return true;
		}
		else {
			return false;
		}
	}

	public boolean agregarVendedores(Vendedor vendedor, String rut) {
		if (buscarVendedor(rut) == null){
			this.vendedores.add(vendedor);
			return true;
		}
		else {
			return false;
		}
	}

	public boolean agregarInmuebles(Inmueble inmueble, int precio, TipoDeConstruccion tipoDeConstruccion) {
		if (buscarInmueblePorPrecio(precio) == null || inmueble.getTipoDeConstruccion().equals(tipoDeConstruccion)){
			this.inmuebles.add(inmueble);
			return true;
		}
		else {
			return false;
		}
	}

	public boolean darDeBaja(Inmueble inmueble, int precio, TipoDeConstruccion tipoDeConstruccion) {
		if (buscarInmueblePorPrecio(precio) == null || inmueble.getTipoDeConstruccion().equals(tipoDeConstruccion)){
			this.inmuebles.remove(inmueble);
			return true;
		}
		else {
			return false;
		}
	}

	public Inmueble buscarInmueblePorTipoDeConstruccion(TipoDeConstruccion tipoDeConstruccion) {
		for (Inmueble inmueble : this.inmuebles){
			if (inmueble.getTipoDeConstruccion().equals(tipoDeConstruccion)){
				return inmueble;
			}
		}
		return null;
	}

	public Inmueble buscarInmueblePorPrecio(int precio) {
		for (Inmueble inmueble : this.inmuebles){
			if (inmueble.getPrecio() == precio){
				return inmueble;
			}
		}
		return null;
	}

	public void venta(Vendedor vendedor, Cliente cliente, Inmueble inmueble){

	}
}