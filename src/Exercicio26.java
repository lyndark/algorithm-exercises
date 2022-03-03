package src;

/* Escreva um algoritmo que leia dois números inteiros e compare-os, mostrando 
na tela uma das mensagens abaixo:
 - O primeiro valor é o maior
 - O segundo valor é o maior
 - Não existe valor maior, os dois são iguais */

import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Número 1: ");
        int numberOne = scanner.nextInt();

        System.out.print("Número 2: ");
        int numberTwo = scanner.nextInt();

        scanner.close();

        if (numberOne > numberTwo) {
            System.out.println("O primeiro valor é maior.");
        } else if (numberTwo > numberOne) {
            System.out.println("O segundo valor é maior.");
        } else {
            System.out.println("Não existe valor maior, os dois são iguais.");
        }
    }
}
