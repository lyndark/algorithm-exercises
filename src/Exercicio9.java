package src;

/* Faça um algoritmo que leia quanto dinheiro uma pessoa tem na carteira (em R$) 
e mostre quantos dólares ela pode comprar. Considere US$1,00 = R$3,45 */

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Dinheiro em R$: ");
        double reais = scanner.nextDouble();

        scanner.close();
        
        double converting = reais / 3.45;

        System.out.println("Você pode comprar $" + converting);
    }   
}
