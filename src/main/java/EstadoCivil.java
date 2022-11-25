public enum EstadoCivil {
    Soltero("Soltero"),
    Casado ("Casado"),
    Viudo ("Viudo");

    private String estadoCivil;

    EstadoCivil(String estadoCivil){
        this.estadoCivil = estadoCivil;
    }

    public String getEstadoCivil() {
        return this.estadoCivil;
    }
}