package Aula12;

public class Ave extends Animal{
    private String corPena;

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    @Override
    public void locomover() {
        System.out.println("Voando!");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo incetos");
    }

    @Override
    public void emitirSom() {
        System.out.println("Você disse pipoca?");
    }
    public void fazerNinho(){
        System.out.println("Não seria melhor um kitnet?");
    }
}
