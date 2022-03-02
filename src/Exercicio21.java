package src;

/* Faça um algoritmo que leia um determinado ano e mostre se ele é ou não 
BISSEXTO. */

import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); 

        System.out.print("Digite o ano: ");
        int year = scanner.nextInt();

        scanner.close();

        if ( year % 4 == 0) {
            System.out.println("O ano " + year + " é BISSEXTO.");
        } else {
            System.out.println("O ano " + year + " não é BISSEXTO.");
        }
    }
    
}
