import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Motocicleta extends Bicicleta{
    double velocidad;
    int cilindrada;
    //Cosntructor
    public Motocicleta(){}

    public Motocicleta(double velocidad, int cilindrada) {
        this.velocidad = velocidad;
        this.cilindrada = cilindrada;
    }

    public Motocicleta(String tipo, double velocidad, int cilindrada) {
        super(tipo);
        this.velocidad = velocidad;
        this.cilindrada = cilindrada;
    }

    public Motocicleta(String color, int ruedas, String tipo, double velocidad, int cilindrada) {
        super(color, ruedas, tipo);
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
    //Setter

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public void catalogar() {
        System.out.println("---MOTOCICLETA---");
        System.out.println("Tipo: " + getTipo());
        System.out.println("Color: " + getColor());
        System.out.println("Ruedas: " + getRuedas());
        System.out.println("Velocidad: " + getVelocidad());
        System.out.println("Cilindrada: " + getCilindrada());
        System.out.println(" ");
    }


}
