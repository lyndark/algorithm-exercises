package src;

/* Faça um algoritmo que leia o salário de um funcionário, calcule e mostre o 
seu novo salário, com 15% de aumento */

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Salário atual R$");
        float currentSalary = scanner.nextFloat();

        scanner.close();

        float increase = currentSalary * 15 / 100;
        float salaryWithIncrease = currentSalary + increase;

        System.out.println("Salário com aumento de 15% R$" + salaryWithIncrease);
    }
}
