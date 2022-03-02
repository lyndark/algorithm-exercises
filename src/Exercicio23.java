package src;

/* Numa promoção exclusiva para o Dia da Mulher, uma loja quer dar descontos 
para todos, mas especialmente para mulheres. Faça um programa que leia nome, 
sexo e o valor das compras do cliente e calcule o preço com desconto. Sabendo 
que:
 - Homens ganham 5% de desconto
 - Mulheres ganham 13% de desconto */

import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome: ");
        String customerName = scanner.next();

        System.out.print("Sexo 'F' ou 'M': ");
        String gender = scanner.next();

        System.out.print("Valor das compras R$");
        float valueOfPurchases = scanner.nextFloat();

        float total;

        scanner.close();

        if (gender.charAt(0) == 'F' || gender.charAt(0) == 'f') {
            total = (valueOfPurchases * 13) / 100;
            System.out.println("Parabéns, " + customerName + " você ganhou 13% de desconto");
            System.out.println("Valor das compras com desconto R$" + total);
        } else {
            total = (valueOfPurchases * 5) / 100;
            System.out.println("Parabéns, " + customerName + " você ganhou 5% de desconto " + gender);
            System.out.println("Valor das compras com desconto R$" + total);
        }
    }
}
