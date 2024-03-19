public class Vehiculo {
    protected String color;
    protected int ruedas;

    //Constructor
    public Vehiculo(){}

    public Vehiculo(int ruedas){
        this.ruedas = ruedas;
    }

    public Vehiculo(String color, int ruedas) {
        this.color = color;
        this.ruedas = ruedas;
    }
    //Getters

    public String getColor() {
        return color;
    }

    public int getRuedas() {
        return ruedas;
    }


    //Setters

    public void setColor(String color) {
        this.color = color;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public void catalogar(){

    }

    public void catalogar(int ruedas){
            if (ruedas == 2){
                System.out.println("Es una moto o una bici");
            }else if(ruedas == 4){
                System.out.println("Es un auto o una camioneta");
            }else System.out.println("No es nada");
        }

}
