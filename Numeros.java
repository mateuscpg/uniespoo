package br.uniesp.poo.desafios.exercicioArray;

/*Desenvolva um algoritmo que permita ao usuário informar 10 números inteiros,
        onde esses números serão armazenados em uma lista.
        Em seguida preciso que seja exibido em tela as seguintes informações:
        Exiba o menor valor dos 10 números informados;
        Exiba o maior valor dos 10 números informados;
        A soma de todos os números;
        A soma de todos os números pares;

        Dicas: Utilize a maioria dos assuntos já abordados em sala de aula (if,else, for, arrays, operações,...)*/
import java.util.ArrayList;
public class Numeros {
    ArrayList<Integer> lista = new ArrayList<>();
    private int num1;
    private int maiorNumero;
    private int menorNumero;
    private int somaPares;

    public int getSomaPares() {
        return somaPares;
    }

    public void setSomaPares(int somaPares) {
        this.somaPares = somaPares;
    }

    public int getNum() {
        return num1;
    }

    public void setNum(int num) {
        this.num1 = num;
    }

    public int getMaiorNumero() {
        return maiorNumero;
    }

    public void setMaiorNumero(int maiorNumero) {
        this.maiorNumero = maiorNumero;
    }

    public int getMenorNumero() {
        return menorNumero;
    }

    public void setMenorNumero(int menorNumero) {
        this.menorNumero = menorNumero;
    }
    public void atualMaiorNumero (int num1){
        if (num1 > getMaiorNumero()){
            setMaiorNumero(num1);
        }
    }
    public void atualMenorAltura (int num1){
        if (num1 < getMenorNumero()){
            setMenorNumero(num1);
        }
    }

    public void somaNumeros(){
        int soma = 0;
        for (Integer n : lista) {
            soma += n.intValue();
        }
        System.out.println("A soma dos números é: " + soma);
    }

    public void somaNumerosPares(int num1){
        if (num1 % 2 == 0){
            setSomaPares(getSomaPares() + num1);
        }
    }


}
