package src;

/*  [DESAFIO] Crie um programa que leia o tamanho de três segmentos de reta. 
Analise seus comprimentos e diga se é possível formar um triângulo com essas 
retas. Matematicamente, para três segmentos formarem um triângulo, o comprimento 
de cada lado deve ser menor que a soma dos outros dois. */

import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); 

        System.out.print("Tamanho da reta 1: ");
        float straightOne = scanner.nextFloat();

        System.out.print("Tamanho da reta 2: ");
        float straightTwo = scanner.nextFloat();

        System.out.print("Tamanho da reta 3: ");
        float straightThree = scanner.nextFloat();

        scanner.close();

        if( (straightOne < straightTwo + straightThree) && 
        (straightTwo < straightOne + straightThree)){
            System.out.println("As medidas formam um triângulo");
        } else {
            System.out.println("As médidas não formam um triângulo");
        }
    } 
}
