import javax.swing.*;

public abstract class Animal {
    protected String nombre;
    protected int edad;
    protected String genero;

    //Constructor
    public Animal(){}

    public Animal(String nombre, int edad, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    //Getters

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getGenero() {
        return genero;
    }

    //Setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    //Metodos
    abstract void hacerSondio();
    abstract void informacion();
}
