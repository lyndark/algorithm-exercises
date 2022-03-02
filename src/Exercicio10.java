package src;
/* Faça um algoritmo que leia a largura e altura de uma parede, calcule e 
mostre a área a ser pintada e a quantidade de tinta necessária para o serviço, 
sabendo que cada litro de tinta pinta uma área de 2metros quadrados. */

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); 

        System.out.print("Largura da parede: ");
        double breadth = scanner.nextDouble();

        System.out.print("Altura da parede: ");
        double high = scanner.nextDouble();

        double amountOfInk = (breadth * high) / 2;

        System.out.println("Quantidade de tinta necessária para o serviço: " + amountOfInk + "L.");
    } 
}
