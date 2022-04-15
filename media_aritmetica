package br.uniesp.poo.desafios;

import java.util.Scanner;

public class media {
    String nome;
   public float nota1;
   public float nota2;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite a sua primeira nota: ");
        float nota1 = scanner.nextFloat();

        System.out.println("Digite a sua segunda nota: ");
        float nota2 = scanner.nextFloat();

        float media = (nota1+nota2)/2;

        System.out.println(media);

        if (media <= 4.9 ){
            System.out.println("Aluno em recuperação");
            float recupassar = 10 - media + 2;
            System.out.println("Para passar o aluno precisa tirar "+recupassar+" para passar.");

        }else if (media <= 6.9){
            System.out.println("Aluno está na final");
            float recufinal = 10 - media;
            System.out.println("O Aluno precisa tirar "+recufinal+" para passar.");

        }else if (media >= 7){
            System.out.println("Aluno aprovado por média");
        }
    }
}
