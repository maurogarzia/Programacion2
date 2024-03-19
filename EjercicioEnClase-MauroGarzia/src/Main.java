public class Main {
    public static void main(String[] args) {
        Tecnico tec1 = new Tecnico();
        Oficial ofi1 = new Oficial();
        Directivo direc1 = new Directivo();

        //Tecnico
        tec1.setNombre("Mauro");
        tec1.setIdOperario(44905166);
        tec1.setAntiguedad(4);
        tec1.setEdad(21);
        tec1.ToString();
        tec1.infoTecnico();

        //Oficial
        ofi1.setNombre("Andres");
        ofi1.setRango("Superior");
        ofi1.setIdOperario(14756212);
        ofi1.setAntiguedad(16);
        ofi1.setEdad(56);
        ofi1.infoOficial();
        ofi1.ToString();


        //Directivo
        direc1.setNombre("Almejandra");
        direc1.setEdad(32);
        direc1.setAntiguedad(15);
        direc1.setIdDirectivo(334567);
        direc1.ToString();
        direc1.infoDirectivo();


    }
}