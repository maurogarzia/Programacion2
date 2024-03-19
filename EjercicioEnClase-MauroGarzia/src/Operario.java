public abstract class Operario extends Empleado{
    private int edad;
    protected int idOperario;
    protected int antiguedad;

    //Constructor
    public Operario(){}

    public Operario(int edad, int idOperario, int antiguedad) {
        this.edad = edad;
        this.idOperario = idOperario;
        this.antiguedad = antiguedad;
    }

    public Operario(String nombre, int edad, int idOperario, int antiguedad) {
        super(nombre);
        this.edad = edad;
        this.idOperario = idOperario;
        this.antiguedad = antiguedad;
    }

    //Getter


    public int getEdad() {
        return edad;
    }

    public int getIdOperario() {
        return idOperario;
    }

    public int getAntiguedad() {
        return antiguedad;
    }
    //Setter


    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setIdOperario(int idOperario) {
        this.idOperario = idOperario;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }


    //Metodo
    abstract void ToString();
}
