public abstract class Empleado {
    private String nombre;

    //Constructor
    public Empleado(){}

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    //Getter

    public String getNombre() {
        return nombre;
    }
    //Setter

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Metodo


    abstract void ToString();
}
