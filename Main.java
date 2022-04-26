package br.uniesp.poo.desafios.exercicioIfElse;
// Tem-se um conjunto de dados contendo a altura e o sexo (masculino, feminino) de 10 pessoas.
// Fazer um algoritmo que calcule e escreva:
//a maior e a menor altura do grupo;
//média de altura do sexo igual a masculino;
//o número de registros de sexo igual a feminino.
import com.sun.source.tree.UsesTree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Dados dados = new Dados();
        Scanner scanner = new Scanner(System.in);
        float[] alturas = new float[10];

        dados.setMenorAltura(0f);
        dados.setMenorAltura(0F);
        dados.setNumHomens(0);
        dados.setNumMulheres(0);


        for (int i = 0; i < 10; i++) {
            System.out.print("Informe o sexo da " + (i + 1) + "ª pessoa  (m/f): ");
            dados.setSexo(scanner.next());
            System.out.println("Sua altura: ");
            dados.setAltura(scanner.nextFloat());
            alturas[i] = dados.getAltura();

            dados.atualMaiorAltura(dados.getAltura());
            dados.mediaMasculino(dados.getAltura(), dados.getSexo());
            dados.contaFeminino(dados.getSexo());
        }

        dados.setMenorAltura(dados.getMaiorAltura());


        for (int i = 0; i < 10; i++) {
            dados.atualMenorAltura(alturas[i]);
        }
        System.out.printf("\nMaior altura do grupo: %.2fm.\n", dados.getMaiorAltura());
        System.out.printf("Menor altura do grupo: %.2fm.\n", dados.getMenorAltura());
        System.out.printf("Média de altura dos homens: %.2fm.\n", dados.getMediaHomens());
        System.out.println("Número total de mulheres: " + dados.getNumMulheres());
    }
}
