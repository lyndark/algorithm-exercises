package src;

/* Crie um programa que leia duas notas de um aluno e calcule a sua média, 
mostrando uma mensagem no final, de acordo com a média atingida:
 - Média até 4.9: REPROVADO
 - Média entre 5.0 e 6.9: RECUPERAÇÃO
 - Média 7.0 ou superior: APROVADO */

 import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nota 1: ");
        float noteOne = scanner.nextFloat();

        System.out.print("Nota 2: ");
        float noteTwo = scanner.nextFloat();

        scanner.close();

        float finalAverage = (noteOne + noteTwo) / 2;

        if(finalAverage >= 7){
            System.out.println("APROVADO!");
        } else if ((finalAverage >= 5) && (finalAverage < 7)) {
            System.out.println("RECUPERAÇÃO");
        } else {
            System.out.println("REPROVADO");
        }
    }
}
