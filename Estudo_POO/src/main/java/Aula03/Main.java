package Aula03;

public class Main {

    public static void main(String[] args) {


        Caneta c1 = new Caneta();
        c1.modelo = "BIC Cristal";
        c1.cor = "Azul";
        c1.carga = 90;
        c1.tampar();
        c1.status();
        c1.rabiscar();

        System.out.println("\n");
        c1.destampar();
        c1.status();
        c1.rabiscar();


    }

}
