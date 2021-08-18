package Aula12;

public class Peixe extends Animal{
    private String corEscama;

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    @Override
    public void locomover() {
        System.out.println("continuando a nadar!");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo substancias!");
    }

    @Override
    public void emitirSom() {
        System.out.println("PROOOCUUURAAAANNNNNDDOOOOO NEEEEEMOOOOO.....");
    }
    public void soltarBolha(){
        System.out.println("glub ........ glub ......");
    }
}
