public class Coche extends Vehiculo {
    private double velocidad;
    private int cilindrada;

    //Constructor
    public Coche(){}

    public Coche(double velocidad, int cilindrada) {
        this.velocidad = velocidad;
        this.cilindrada = cilindrada;
    }

    public Coche(String color, int ruedas, double velocidad, int cilindrada) {
        super(color, ruedas);
        this.velocidad = velocidad;
        this.cilindrada = cilindrada;
    }

    //Getters

    public double getVelocidad() {
        return velocidad;
    }

    public int getCilindrada() {
        return cilindrada;
    }
    //Setters

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public void catalogar() {
        System.out.println("---COCHE---");
        System.out.println("Color: " + getColor());
        System.out.println("Ruedas: " + getRuedas());
        System.out.println("Velocidad: " + getVelocidad());
        System.out.println("Cilindrada: " + getCilindrada());
        System.out.println(" ");
    }


}
