package src;

/* Faça um programa que leia o nome de uma pessoa e mostre uma mensagem de boas-vindas para ela:
Ex:
Qual é o seu nome? João da Silva
Olá João da Silva, é um prazer te conhecer!
 */

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual é o seu nome? ");
        String name = scanner.next();

        System.out.println("Olá, " + name + ". É um prazer te conhecer!");
    }
}
