package Aula07e08;

import java.util.Random;

public class Luta {

    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;



    public void marcarLuta(Lutador l1, Lutador l2){

        if ( desafiado.getCategoria().equals(desafiante.getCategoria()) && desafiado != desafiante){

            this.setAprovada(true);
            this.setDesafiante(l2);
            this.setDesafiado(l1);
        }else{
            this.setAprovada(false);
            this.setDesafiante(null);
            this.setDesafiado(null);
        }

    }

    public void lutar(){
        if ( this.isAprovada() == true){

            this.desafiado.apresentar();
            this.desafiante.apresentar();
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);

            switch (vencedor){
                case 0:
                    System.out.println("Empatou!!");
                    desafiante.empatarLuta();
                    desafiado.empatarLuta();
                    break;
                case 1:
                    System.out.println(desafiado.getNome()+" Ganhou!!");
                    desafiado.ganharLuta();
                    desafiante.perderLuta();
                    break;
                case 2:
                    System.out.println(desafiante.getNome()+" Ganhou!!");
                    desafiado.perderLuta();
                    desafiante.ganharLuta();

            }


        }else {
            System.out.println("A luta não pode acontecer");
        }


    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
