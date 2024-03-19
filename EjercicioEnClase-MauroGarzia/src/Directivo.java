import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Directivo extends Empleado{
    private int antiguedad;
    private int idDirectivo;
    private int edad;

    //Constructor
    public Directivo(){

    }

    public Directivo(int antiguedad, int idDirectivo, int edad) {
        this.antiguedad = antiguedad;
        this.idDirectivo = idDirectivo;
        this.edad = edad;
    }

    public Directivo(String nombre, int antiguedad, int idDirectivo, int edad) {
        super(nombre);
        this.antiguedad = antiguedad;
        this.idDirectivo = idDirectivo;
        this.edad = edad;
    }

    //Getter


    public int getAntiguedad() {
        return antiguedad;
    }

    public int getIdDirectivo() {
        return idDirectivo;
    }

    public int getEdad() {
        return edad;
    }
    //Setter


    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public void setIdDirectivo(int idDirectivo) {
        this.idDirectivo = idDirectivo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    //Metodo
    public void infoDirectivo(){
        System.out.println("El Directivo tiene una antiguedad de: " + getAntiguedad());
        System.out.println("El Id del Directivo es: " + getIdDirectivo());
        System.out.println("Se edad es: " + getEdad());
    }



    @Override
    void ToString() {
        System.out.println("---DIRECTIVO---");
        System.out.println("El Directivo se llama: " + getNombre());

    }

}
