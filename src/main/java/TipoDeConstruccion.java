public enum TipoDeConstruccion {
    Madera("Madera"),
    Cemento("Cemento");

    private String tipoDeConstruccion;

    TipoDeConstruccion(String tipoDeConstruccion) {
        this.tipoDeConstruccion = tipoDeConstruccion;
    }

    public String getTipoDeConstruccion() {
        return tipoDeConstruccion;
    }
}