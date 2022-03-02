package src;

/* [DESAFIO] Escreva um programa para calcular a redução do tempo de vida de um 
fumante. Pergunte a quantidade de cigarros fumados por dias e quantos anos ele 
já fumou. Considere que um fumante perde 10 min de vida a cada cigarro. Calcule 
quantos dias de vida um fumante perderá e exiba o total em dias */

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantidade de cigarros fumados por dia? ");
        float cigarettePerDay = scanner.nextInt();

        System.out.print("Quantos anos fumando? ");
        float yearsSmoking = scanner.nextInt();

        scanner.close();

        float minutesOfLife = cigarettePerDay * 10;
        float hoursOfLife = minutesOfLife / 60;
        float daysOfLife = hoursOfLife / 24;

        float total = yearsSmoking * daysOfLife * 365;

        System.out.println("Total de dias perdido: " + total);
    }
}
