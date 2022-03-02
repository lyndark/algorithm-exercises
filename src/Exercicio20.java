package src;

/* Desenvolva um programa que leia um número inteiro e mostre se ele é PAR ou 
ÍMPAR */
import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int number = scanner.nextInt();

        scanner.close();

        if (number % 2 == 0) {
            System.out.println("O número " + number);
            System.out.println("É Par!");
        } else {
            System.out.println("O número " + number);
            System.out.println("É Ímpar!");
        }
    }

}
