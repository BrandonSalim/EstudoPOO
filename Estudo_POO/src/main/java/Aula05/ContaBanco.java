package Aula05;

public class ContaBanco {

    public Integer id;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public ContaBanco() {

        this.saldo = 0;
        this.status = false;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void abrirConta(String tipoDaConta){
       if (tipoDaConta.equals("cp") || tipoDaConta.equals("cp")) {
           if (tipoDaConta.equals("cp")) {
               this.setSaldo(150.0f);
               this.setTipo(tipoDaConta);
           }
           if (tipoDaConta.equals("cc")) {
               this.setSaldo(50.0f);
               this.setTipo(tipoDaConta);
           }
           this.setStatus(true);
       }
       else System.out.println("Tipo de Conta invalido!");
    }

    public void fecharConta(){
        if ( this.getSaldo() == 0f){
            System.out.println("Conta fechada com sucesso!");
            this.setStatus(false);
        } else if (this.getSaldo() > 0f){
            System.out.println("Para fechar a conta é necessario sacar todo o dinheiro nela!");
        }else if (this.getSaldo() < 0f){
            System.out.println("Para fechar a conta é necessario não estar devendo!");
        }

    }
    public void depositar(float deposito){
        if (isStatus() == true){
            this.setSaldo(this.getSaldo()+deposito);
        }else {
            System.out.println("Sua Conta ainda não foi aberta!");
        }

    }
    public void sacar(float saque){
        if (isStatus() == true){

            if (saque > this.getSaldo()){
                System.out.println("Voce não tem saldo para esse saque!");
            }else{
                this.setSaldo(this.getSaldo() - saque);
            }

        }else {
            System.out.println("Sua Conta ainda não foi aberta!");
        }

    }
    public void pagarMensal(){
        float valor = 0;

        if (this.getTipo().equals("cc")) {
            valor = 12f;
        }
        if (this.getTipo().equals("cp")) {
            valor = 20f;
        }

        if (isStatus() == true) {
            this.setSaldo(this.getSaldo() - valor);
        }else if (this.getSaldo() < valor) {
            System.out.println("Impossivel pagar a mensalidade!");
        }
        else{
                System.out.println("Sua conta ainda não foi aberta!");
            }
        }

    @Override
    public String toString() {
        return "ContaBanco{" +
                "id=" + id +
                ", tipo='" + tipo + '\'' +
                ", dono='" + dono + '\'' +
                ", saldo=" + saldo +
                ", status=" + status +
                '}';
    }
}




