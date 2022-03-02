package src;

/* Crie um programa que leia o nome e o salário de um funcionário, mostrando no 
final uma mensagem.
Ex:
Nome do Funcionário: Maria do Carmo
Salário: 1850,45
O funcionário Maria do Carmo tem um salário de R$1850,45 em Junho. */

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome do funcionário: ");
        String employeeName = scanner.next();

        System.out.print("Salário: ");
        double remuneration = scanner.nextDouble();

        scanner.close();

        System.out.println("O funcionário " + employeeName + " tem um salário de R$" + remuneration + " em Junho.");
    }
}
