package Aula12;

public class Reptil extends Animal{

    private String corEscama;

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    @Override
    public void locomover() {
        System.out.println("rastejando!");
    }

    @Override
    public void alimentar() {
        System.out.println("comendo folhas!");
    }

    @Override
    public void emitirSom() {
        System.out.println("Dori me! som de reptil q");
    }
}
