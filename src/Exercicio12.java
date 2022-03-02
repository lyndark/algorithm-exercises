package src;

/* Crie um programa que leia o preço de um produto, calcule e mostre o seu 
PREÇO PROMOCIONAL, com 5% de desconto */

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Preço do produto R$");
        float productPrice = scanner.nextFloat();

        scanner.close();

        float discountedProduct = (productPrice * 5) / 100;
        float finalPrice = productPrice - discountedProduct;

        System.out.println("VALOR PROMOCIONAL R$" + finalPrice);
        System.out.println("Desconto de R$" + discountedProduct);
    }
}
