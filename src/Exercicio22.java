package src;

/* Escreva um programa que leia o ano de nascimento de um rapaz e mostre a sua 
situação em relação ao alistamento militar.
 - Se estiver antes dos 18 anos, mostre em quantos anos faltam para o 
alistamento.
 - Se já tiver depois dos 18 anos, mostre quantos anos já se passaram do 
alistamento */

import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ano atual: ");
        int currentYear = scanner.nextInt();

        System.out.print("Ano de nascimento: ");
        int birthYear = scanner.nextInt();

        scanner.close();

        int age = currentYear - birthYear;
        int total;

        if (age < 18) {
            total = 18 - age;
            System.out.println("Você tem " + age + " anos.");
            System.out.println("Não pode se alistar, ainda falta " + total + " anos.");
        } else {
            total = age - 18;
            System.out.println("Você tem " + age + " anos.");
            System.out.println("Já se passaram " + total + " anos do alistamento");
        }
    }
}
