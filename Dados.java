package br.uniesp.poo.desafios.exercicioIfElse;
// Tem-se um conjunto de dados contendo a altura e o sexo (masculino, feminino) de 10 pessoas.
// Fazer um algoritmo que calcule e escreva:
//a maior e a menor altura do grupo;
//média de altura do sexo igual a masculino;
//o número de registros de sexo igual a feminino.

public class Dados {
    private  float altura;
    private String sexo;
    private float maiorAltura;
    private float menorAltura;
    private float somaAltura;
    private int numHomens;
    private int numMulheres;
    private float mediaHomens;

    public float getMediaHomens() {
        return mediaHomens;
    }

    public void setMediaHomens(float mediaHomens) {
        this.mediaHomens = mediaHomens;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public float getMaiorAltura() {
        return maiorAltura;
    }

    public void setMaiorAltura(float maiorAltura) {
        this.maiorAltura = maiorAltura;
    }

    public float getMenorAltura() {
        return menorAltura;
    }

    public void setMenorAltura(float menorAltura) {
        this.menorAltura = menorAltura;
    }

    public float getSomaAltura() {
        return somaAltura;
    }

    public void setSomaAltura(float somaAltura) {
        this.somaAltura = somaAltura;
    }

    public int getNumHomens() {
        return numHomens;
    }

    public void setNumHomens(int numHomens) {
        this.numHomens = numHomens;
    }

    public int getNumMulheres() {
        return numMulheres;
    }

    public void setNumMulheres(int numMulheres) {
        this.numMulheres = numMulheres;
    }
    public void atualMaiorAltura(float altura){
        if (altura > getMaiorAltura()){
            setMaiorAltura(altura);
        }
    }
    public void atualMenorAltura(float altura){
        if (altura < getMenorAltura()){
            setMenorAltura(altura);
        }
    }
    public void mediaMasculino(float altura, String sexo){
        if(sexo.equalsIgnoreCase("m")){
            setSomaAltura(getSomaAltura() + altura);
            setNumHomens(getNumHomens() + 1);
            setMediaHomens(getSomaAltura()/getNumHomens());
        }
    }
    public void contaFeminino(String sexo){
        if(sexo.equalsIgnoreCase("f")){
            setNumMulheres(getNumMulheres() + 1);
        }
    }
}
