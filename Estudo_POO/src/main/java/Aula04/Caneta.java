package Aula04;

public class Caneta {
    private String modelo;
    private float ponta;

    public Caneta(String modelo, float ponta) {
        this.modelo = modelo;
        this.ponta = ponta;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    @Override
    public String toString() {
        return "Caneta{" +
                "modelo='" + modelo + '\'' +
                ", ponta=" + ponta +
                '}';
    }
}
