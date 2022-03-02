package src;

/* Faça um programa que leia um número inteiro e mostre o seu antecessor e seu 
sucessor.
Ex: 
Digite um número: 9
O antecessor de 9 é 8
O sucessor de 9 é 10 */

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int number = scanner.nextInt();

        int antecedent = number - 1;
        int heir = number + 1;

        scanner.close();

        System.out.println("O antecessor de " + number + " é " + antecedent + ".");
        System.out.println("O sucessor de " + number + " é " + heir + ".");
    }
}
