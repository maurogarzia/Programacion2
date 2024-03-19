public class Perro extends Animal{
    private String raza;
    private String color;
    private String tamanio;

    //Constructor
    public Perro(){}

    public Perro(String raza, String color, String tamanio) {
        this.raza = raza;
        this.color = color;
        this.tamanio = tamanio;
    }

    public Perro(String nombre, int edad, String genero, String raza, String color, String tamanio) {
        super(nombre, edad, genero);
        this.raza = raza;
        this.color = color;
        this.tamanio = tamanio;
    }

    //Getter

    public String getRaza() {
        return raza;
    }

    public String getColor() {
        return color;
    }

    public String getTamanio() {
        return tamanio;
    }

    //Setter

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    //Metodos

    void informacion(){
        System.out.println("---PERRO---");
        System.out.println("Su nombre es: " + this.nombre);
        System.out.println("Es de tamaño: " + this.tamanio); //De la clase
        System.out.println("Es de color: " + this.color); //De la clase
        System.out.println("Pertenece a la raza: " + this.raza); //De la clase
        System.out.println("Su edad es: " + this.edad);
        System.out.println("Su genero es: " + this.genero);
    }

    @Override
    void hacerSondio() {
        System.out.println("GUAU, GUAU...");
    }
}
