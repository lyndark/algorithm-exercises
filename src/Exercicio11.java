package src;

/*  Desenvolva uma lógica que leia os valores de A, B e C de uma equação do 
segundo grau e mostre o valor de Delta.*/ 

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); 

        System.out.print("A: ");
        float a = scanner.nextFloat();

        System.out.print("B: ");
        float b = scanner.nextFloat();

        System.out.print("C: ");
        float c = scanner.nextFloat();

        float delta = (b * b) - (4 * a * c);

        System.out.println("Delta: " + delta);
    } 
}
