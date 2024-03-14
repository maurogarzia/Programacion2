

public class Auto extends Vehiculo {
    //Atributos
    private boolean descapotable;

    //Constructor

    public Auto(String duenio, int puertas, int ruedas, boolean descapotable) {
        super(duenio, puertas, ruedas);
        this.descapotable = descapotable;
    }

    //Getter

    public boolean getDescapotable() {
        return descapotable;
    }

    //Setter

    public void setDescapotable(Boolean descapotable) {
        this.descapotable = descapotable;
    }

    //Metodos
    public void bajar() {
        System.out.println("Bajando del auto");
    }

    @Override
    public void caracteristicas() {
        System.out.println("Puertas: " + this.getPuertas());
        System.out.println(("Ruedas: "+ this.getRuedas()));
        System.out.println("El propietario del auto es: " + getDuenio());
        if (descapotable == true){
            System.out.println("El auto es descapotable");
            }else {
            System.out.println("No es descapotable");
        }
    }
}

