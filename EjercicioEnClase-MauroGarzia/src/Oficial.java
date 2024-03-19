

public class Oficial extends Operario {

    private String rango;

    //Constructor
    public Oficial() {
    }

    public Oficial(String rango) {
        this.rango = rango;
    }

    public Oficial(int edad, int idOperario, int antiguedad, String rango) {
        super(edad, idOperario, antiguedad);
        this.rango = rango;
    }

    public Oficial(String nombre, int edad, int idOperario, int antiguedad, String rango) {
        super(nombre, edad, idOperario, antiguedad);
        this.rango = rango;
    }

    //Getter

    public String getRango() {
        return rango;
    }
    //Setter

    public void setRango(String rango) {
        this.rango = rango;
    }

    //Metodo

    public void infoOficial(){
        System.out.println("El rango del Oficial es: " + getRango());
    }

    @Override
    public void ToString(){
        System.out.println("---OFICIAL---");
        System.out.println("El Oficial se llama: " + getNombre());
    }
}

