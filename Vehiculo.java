abstract class Vehiculo {
    private String duenio;
    private int puertas;
    private int ruedas;

    //Cosntructor
    public Vehiculo(){

    }

    public Vehiculo(String duenio, int puertas, int ruedas) {
        this.duenio = duenio;
        this.puertas = puertas;
        this.ruedas = ruedas;
    }

    //Getters

    public String getDuenio() {
        return duenio;
    }

    public int getPuertas() {
        return puertas;
    }

    public int getRuedas() {
        return ruedas;
    }

    //Setters

    public void setDuenio(String duenio) {
        this.duenio = duenio;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public void caracteristicas(){

    }

}
