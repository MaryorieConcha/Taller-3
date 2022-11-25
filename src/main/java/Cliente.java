public class Cliente extends Persona {
    public Cliente(String nombre, String rut, String direccion) {
        super(nombre, rut, direccion);
    }

    @Override
    public String toString() {
        return "Cliente{Nombre: "+super.getNombre()+", Rut: "+super.getRut()+", Dirección: "+super.getDireccion()+"}";
    }
}