package Aula02;

class Caneta {
    String modelo;
    String cor;
    Float ponta;
    Integer carga;
    Boolean tampada;

    void status(){
        System.out.println("O modelo da caneta é: "+ this.modelo);
        System.out.println("A cor da caneta é: " + this.cor);
        System.out.println("O tamanho da ponta é: "+ this.ponta);
        System.out.println("A carga da caneta é: " +this.carga+"%");
        System.out.println("A caneta esta tampada? "+ this.tampada);
    }

    void rabiscar(){
        if (tampada == true){
            System.out.println("Não posso rabiscar.");
        }else {
            System.out.println("estou rabiscando!");
        }
    }



    void tampar(){
        this.tampada = true;
    }

    void destampar(){
        this.tampada = false;
    }


}
