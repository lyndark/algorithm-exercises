package src;

/* [DESAFIO] Refaça o algoritmo 25, acrescentando o recurso de mostrar que tipo 
de triângulo será formado: 
 - EQUILÁTERO: todos os lados iguais
 - ISÓSCELES: dois lados iguais
 - ESCALENO: todos os lados diferentes */

import java.util.Scanner;

public class Exercicio30 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Tamanho da reta 1: ");
        float straightOne = scanner.nextFloat();

        System.out.print("Tamanho da reta 2: ");
        float straightTwo = scanner.nextFloat();

        System.out.print("Tamanho da reta 3: ");
        float straightThree = scanner.nextFloat();

        scanner.close();

        if ((straightOne == straightTwo) && (straightOne == straightThree)) {
            System.out.println("TRIÂNGULO EQUILÁTERO");
        } else if ((straightOne == straightTwo) && ((straightThree != straightOne))) {
            System.out.println("TRIÂNGULO ISÓSCELES");
        } else {
            System.out.println("TRIÂNGULO ESCALENO");
        }
    }
}
