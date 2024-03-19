public class Camioneta extends Coche{
    private float Carga;

    //Constructor
    public Camioneta(){}

    public Camioneta(float carga) {
        Carga = carga;
    }

    public Camioneta(double velocidad, int cilindrada, float carga) {
        super(velocidad, cilindrada);
        Carga = carga;
    }

    public Camioneta(String color, int ruedas, double velocidad, int cilindrada, float carga) {
        super(color, ruedas, velocidad, cilindrada);
        Carga = carga;
    }

    //Getters

    public float getCarga() {
        return Carga;
    }
    //Setters

    public void setCarga(float carga) {
        Carga = carga;
    }

    @Override
    public void catalogar() {
        System.out.println("---CAMIONETA---");
        System.out.println("Color: " + getColor());
        System.out.println("Ruedas: " + getRuedas() );
        System.out.println("Velocidad: " + getVelocidad());
        System.out.println("Cilindrada: " + getCilindrada());
        System.out.println("Carga: " + getCarga());
        System.out.println(" ");
    }
}
