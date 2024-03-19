public class Bicicleta extends Vehiculo{
    protected String tipo;

    //Constructor
    public Bicicleta(){}

    public Bicicleta(String tipo) {
        this.tipo = tipo;
    }

    public Bicicleta(String color, int ruedas, String tipo) {
        super(color, ruedas);
        this.tipo = tipo;
    }

    //Gettter

    public String getTipo() {
        return tipo;
    }
    //Setter

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void catalogar() {
        System.out.println("---BICICLETA---");
        System.out.println("Tipo: " + getTipo());
        System.out.println("Ruedas: " + getRuedas());
        System.out.println("Color: " + getColor());
    }
}

