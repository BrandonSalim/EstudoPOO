package Aula07e08;

public class Lutador {

    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;


    public void apresentar(){
        System.out.println("Lutador: "+getNome());
        System.out.println("Origem: "+ getNacionalidade());
        System.out.println(getIdade()+" anos");
        System.out.println(getAltura()+"m de altura");
        System.out.println("Pesando "+getPeso()+" kilos");
        System.out.println("Ganhou "+getVitorias()+" lutas");
        System.out.println("Perdeu "+getDerrotas()+" lutas");
        System.out.println("Empatou "+getEmpates()+" lutas");
    }
    public void status(){

        System.out.println(getNome()+ "é um peso "+getCategoria());
        System.out.println("Ganhou "+getVitorias()+" lutas");
        System.out.println("Perdeu "+getDerrotas()+" lutas");
        System.out.println("Empatou "+getEmpates()+" lutas");
    }
    public void ganharLuta(){
        this.setVitorias(getVitorias() + 1);
    }

    public void perderLuta(){
        this.setDerrotas(getDerrotas() + 1);
    }

    public void empatarLuta(){
        this.setEmpates(getEmpates() + 1);
    }

    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        setCategoria(this.getPeso());
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria(float peso) {

        if (peso < 50.2f){
            this.categoria = "Invalido";
        }else if (peso <= 70.3f ){
            this.categoria = "Peso leve";
        }else if (peso <= 83.9f) {
            this.categoria = "Peso medio";
        }else if (peso <= 120.2f){
            this.categoria = "Peso pesado";
        }else this.categoria = "Invalido";
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }




}

