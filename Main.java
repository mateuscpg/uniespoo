package br.uniesp.poo.desafios.exercicioArray;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Numeros num = new Numeros();
        Scanner scanner = new Scanner(System.in);

        num.setMaiorNumero(0);
        num.setMenorNumero(Integer.MAX_VALUE);
        num.setSomaPares(0);

        for (int i = 0; i < 5; i++ ){
            System.out.println("Informe os números que estarão no array: ");
            int num1 = scanner.nextInt();
            num.atualMaiorNumero(num1);
            num.atualMenorAltura(num1);
            num.somaNumerosPares(num1);
            num.lista.add(num1);

        }
        num.somaNumeros();
        System.out.println("O maior número é:"+num.getMaiorNumero());
        System.out.println("O menor número é: " +num.getMenorNumero());
        System.out.println("A soma de números pares é: "+num.getSomaPares());

    }
}
