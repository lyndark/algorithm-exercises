package src;

/* Escreva um programa para aprovar ou não o empréstimo bancário para a compra 
de uma casa. O programa vai perguntar o valor da casa, o salário do comprador e 
em quantos anos ele vai pagar. Calcule o valor da prestação mensal, sabendo que 
ela não pode exceder 30% do salário ou então o empréstimo será negado */

import java.util.Scanner;

public class Exercicio32 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Valor da casa: R$");
        float houseValue = scanner.nextFloat();

        System.out.print("Salário: R$");
        float wage = scanner.nextFloat();

        System.out.print("Em quantos anos irá pagar? ");
        float year = scanner.nextFloat();

        scanner.close();

        float installment = houseValue / (year * 12);

        float total = wage * 0.3f;

        if(installment > total){
            System.out.println("Empréstimo recusado");
        } else {
            System.out.println("Empréstimo aprovado!");
        }
    }
}
