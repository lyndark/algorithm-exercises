package src;

/*  A locadora de carros precisa da sua ajuda para cobrar seus serviços. Escreva 
um programa que pergunte a quantidade de Km percorridos por um carro alugado e a 
quantidade de dias pelos quais ele foi alugado. Calcule o preço total a pagar, 
sabendo que o carro custa R$90 por dia e R$0,20 por Km rodado */

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantida de Km percorridos: ");
        float km = scanner.nextFloat();

        System.out.print("Dias de aluguel: ");
        float rent = scanner.nextFloat();
         
        float dayRent = rent * 90;
        float kmRun = km * 20 / 100;
        float totalPayable = dayRent + kmRun;

        System.out.println("Total a pagar R$" + totalPayable); 
    }
}
