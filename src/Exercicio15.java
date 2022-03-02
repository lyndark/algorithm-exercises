package src;

/*  Crie um programa que leia o número de dias trabalhados em um mês e mostre o 
salário de um funcionário, sabendo que ele trabalha 8 horas por dia e ganha R$25 
por hora trabalhada */

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Número de dias trabalhados em um mês: ");
        int daysWorked = scanner.nextInt();

        scanner.close();

        double wage = daysWorked * 25 * 8;

        System.out.println("Salário do Funcionário R$" + wage);
    }
}
