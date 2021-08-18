package Aula12;

public class Mamifero extends Animal{

    private String corPelo;

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    @Override
    public void locomover() {
        System.out.println("correndo!");
    }

    @Override
    public void alimentar() {
        System.out.println("Mamando!");
    }

    @Override
    public void emitirSom() {
        System.out.println("AAAAAAAAA! :3");
    }
}
