package src;

/* Faça um programa que leia o ano de nascimento de uma pessoa, calcule a idade 
dela e depois mostre se ela pode ou não votar. */

import java.util.Scanner;

public class Exercicio18 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ano atual: ");
        int currentYear = scanner.nextInt();

        System.out.print("Ano nascimento: ");
        int yearOfBirth = scanner.nextInt();

        scanner.close();

        int age = currentYear - yearOfBirth;

        if (age >= 18) {
            System.out.println("Você já pode votar!");
        } else {
            System.out.println("Você não pode votar!");
        }
    }
}
