
public class Gato extends Animal{
    private String tamanio;
    private String color;


    //Cosntructor
    public Gato(){}



    public Gato(String tamanio, String color) {
        this.tamanio = tamanio;
        this.color = color;

    }

    public Gato(String nombre, int edad, String genero, String tamanio, String color) {
        super(nombre, edad, genero);
        this.tamanio = tamanio;
        this.color = color;
    }

    //Getter

    public String getTamanio() {
        return tamanio;
    }

    public String getColor() {
        return color;
    }


    //Setter

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public void setColor(String color) {
        this.color = color;
    }


    //Metodos
     void informacion(){
        System.out.println("---GATO---");
        System.out.println("Su nombre es: " + this.nombre);
        System.out.println("Es de tamaño: " + this.tamanio);//De la clase
        System.out.println("Es de color: " + this.color);//De la clase
        System.out.println("Su edad es: " + this.edad);
        System.out.println("Su genero es: " + this.genero);

    }

    @Override
    void hacerSondio() {
        System.out.println("MIAU, MIAU...");
    }
}
