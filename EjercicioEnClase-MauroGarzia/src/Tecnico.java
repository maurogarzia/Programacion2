public class Tecnico extends Operario{
    private String capacitacion;

    //Constructor
    public Tecnico(){}

    public Tecnico(String capacitacion) {
        this.capacitacion = capacitacion;
    }

    public Tecnico(int edad, int idOperario, int antiguedad, String capacitacion) {
        super(edad, idOperario, antiguedad);
        this.capacitacion = capacitacion;
    }

    public Tecnico(String nombre, int edad, int idOperario, int antiguedad, String capacitacion) {
        super(nombre, edad, idOperario, antiguedad);
        this.capacitacion = capacitacion;
    }

    //Getter

    public String getCapacitacion() {
        return capacitacion;
    }
    //Setter

    public void setCapacitacion(String capacitacion) {
        this.capacitacion = capacitacion;
    }

    //Metodo

    public void infoTecnico(){
        System.out.println("La capacitacion del Tecnico es: " + getCapacitacion());
    }

    @Override
    void ToString() {
        System.out.println("---TECNICO---");
        System.out.println("El Tecnico se llama: " + getNombre());
    }

}
