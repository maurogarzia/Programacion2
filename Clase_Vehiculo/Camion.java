public class Camion extends Vehiculo {
    private float carga;

    //Cosntructor

    public Camion(){}

    public Camion(float carga) {
        this.carga = carga;
    }

    public Camion(String duenio, int puertas, int ruedas, float carga) {
        super(duenio, puertas, ruedas);
        this.carga = carga;
    }

    //Getters
    public float getCarga() {
        return carga;
    }

    //Seters

    public void setCarga(float carga) {
        this.carga = carga;
    }

    //Metodos
    @Override
    public void caracteristicas() {
        System.out.println("La carga es: " + this.carga);
        if (carga > 150){
            System.out.println("El tanque esta sobre cargado");
        }else {
            System.out.println("Se ha cargado el tanque");
        }
    }
}
