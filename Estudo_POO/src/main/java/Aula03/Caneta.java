package Aula03;

class Caneta {
    public String modelo;
    public String cor;
    private Float ponta;
    protected int carga;
    private Boolean tampada;

    public void status(){
        System.out.println("O modelo da caneta é: "+ this.modelo);
        System.out.println("A cor da caneta é: " + this.cor);
        System.out.println("O tamanho da ponta é: "+ this.ponta);
        System.out.println("A carga da caneta é: " +this.carga+"%");
        System.out.println("A caneta esta tampada? "+ this.tampada);
    }

    public void rabiscar(){
        if (tampada == true){
            System.out.println("Não posso rabiscar.");
        }else {
            System.out.println("estou rabiscando!");
        }
    }


    public void tampar(){
        this.tampada = true;
    }

    public void destampar(){
        this.tampada = false;
    }


}
