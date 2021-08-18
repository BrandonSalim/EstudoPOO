package Aula02;

public class Main {

    public static void main(String[] args) {


        Caneta c1 = new Caneta();

        c1.cor = "azul";
        c1.ponta = 0.5f;
        c1.tampada = false;
        c1.status();
        c1.tampar();
        c1.status();
        c1.rabiscar();
        c1.destampar();
        c1.rabiscar();

        System.out.println("\n");

        Caneta c2 = new Caneta();
        c2.modelo = "Hostnet";
        c2.cor = "preta";
        c2.destampar();
        c2.status();
        c2.rabiscar();


    }

}
