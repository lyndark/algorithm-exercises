package src;

/* Desenvolva um algoritmo que leia dois números inteiros e mostre o somatório 
entre eles.
Ex:
Digite um valor: 8
Digite outro valor: 5
A soma entre 8 e 5 é igual a 13. */

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int valueOne = scanner.nextInt();

        System.out.print("Digite outro valor: ");
        int valueTwo = scanner.nextInt();

        scanner.close();

        int sumOfNumbers = valueOne + valueTwo;

        System.out.println("A soma entre " + valueOne + " e " + valueTwo + " é igual a " + sumOfNumbers + ".");
    }
}
