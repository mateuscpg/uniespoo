package br.uniesp.poo;

import java.util.Scanner;

public class Aluno {
    public static void main(String[] args) {



        //Declaração do obj e inicialização
        //com o obj de entrada predefinido
        Scanner scanner = new Scanner(System.in);
        int nota1, nota2;
        float media;

        System.out.println("Qual é o seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Nome do curso: ");
        String curso = scanner.nextLine();

        System.out.println("Número do período: ");
        int periodo = scanner.nextInt();

        System.out.println("Valor da primeira nota: ");
        nota1 = scanner.nextInt();

        System.out.println("Valor da segunda nota: ");
        nota2 = scanner.nextInt();

        media = (nota1 + nota2) /2;

        System.out.println("Quantidade de faltas: ");
        int faltas = scanner.nextInt();


        System.out.println("O seu nome é: "+nome);
        System.out.println("Seu curso é: "+curso);
        System.out.println("Seu período é: "+periodo);
        System.out.println("Valor da primeira nota: "+nota1);
        System.out.println("Valor da segunda nota: "+nota2);
        System.out.println("Sua média é: "+media);

    }
}
