package Aula06;

public class ControleRemoto implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto() {
        this.setVolume(50);
        this.setTocando(false);
        this.setLigado(false);
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }


    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println(this.isLigado());
        System.out.println(this.isTocando());
        System.out.println(this.getVolume());
        for (int i = 0; i < this.getVolume(); i += 10){
            System.out.print("|");
        }

    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu!");
    }

    @Override
    public void maisVolume() {
        if (this.isLigado()==true) this.setVolume(this.getVolume()+10);
    }

    @Override
    public void menosVolume() {
        if (this.isLigado()==true) this.setVolume(this.getVolume()-10);
    }

    @Override
    public void ligarMudo() {
        if (this.isLigado() && this.getVolume() > 0) this.setVolume(0);
    }

    @Override
    public void desligarMudo() {
        if (this.isLigado() && this.getVolume() == 0) this.setVolume(50);
    }

    @Override
    public void play() {
        if (this.isLigado() && this.isTocando() == false ) this.setTocando(true);
    }

    @Override
    public void pause() {
        if (this.isLigado() && this.isTocando() == true ) this.setTocando(false);
    }
}
