package src;

/* Crie um algoritmo que leia um número real e mostre na tela o seu dobro e a 
sua terça parte.
Ex: 
Digite um número: 3.5
O dobro de 3.5 é 7.0
A terça parte de 3.5 é 1.16666 */

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double number = scanner.nextDouble();

        scanner.close();

        double numberDouble = number + number;
        double thirdPart = number / 3;

        System.out.println("O dobro de " + number + " é " + numberDouble);
        System.out.format("A terça parte de %.2f é  %.2f" , number , thirdPart);
    } 
}
