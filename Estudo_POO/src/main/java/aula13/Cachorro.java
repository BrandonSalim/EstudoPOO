package aula13;

public class Cachorro extends Lobo{

    @Override
    public void emitirSom(){
        System.out.println("AU AU AU");
    }

    public void reagir (String frase){

        if (frase.equals("toma comida") || frase.equals("ola")) System.out.println("abanar o rabo e latir");
        else System.out.println("rosnar");

    }

    public void reagir (int hora, int min){

        if ( hora < 12) System.out.println("abanar o rabo");
        else if ( hora <= 18) System.out.println("abanar o rabo e latir");
        else System.out.println("ignorar");

    }
    public void reagir (boolean dono){

        if (dono == true) System.out.println("abanar o rabo e latir");
        else System.out.println("rosnar");

    }
    public void reagir (int idade, float peso){
        if (idade < 5){
            if (peso < 10) System.out.println("abanar");
            else System.out.println("latir");
        }
        else{
            if (peso < 10) System.out.println("rosnar");
            else System.out.println("ignorar");
        }



    }

}
