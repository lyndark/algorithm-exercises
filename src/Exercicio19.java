package src;

/* Crie um algoritmo que leia o nome e as duas notas de um aluno, calcule a sua 
média e mostre na tela. No final, analise a média e mostre se o aluno teve ou 
não um bom aproveitamento (se ficou acima da média 7.0) */

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nota 1: ");
        float noteOne = scanner.nextFloat();

        System.out.print("Nota 2: ");
        float noteTwo = scanner.nextFloat();

        scanner.close();

        float finalAverage = (noteOne + noteTwo) / 2;

        if (finalAverage > 7) {
            System.out.println("Média final: " + finalAverage);
            System.out.println("Parabéns, você teve um bom aproveitamento nesse semestre!");
        } else {
            System.out.println("Média final: " + finalAverage);
            System.out.println("Não obteve um bom aproveitamento nesse semestre!");
        }
    }
}
