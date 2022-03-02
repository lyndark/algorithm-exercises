package src;

/*  Faça um algoritmo que pergunte a distância que um passageiro deseja 
percorrer em Km. Calcule o preço da passagem, cobrando R$0.50 por Km para 
viagens até 200Km e R$0.45 para viagens mais longas */

import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); 

        System.out.print("Qual a distância que deseja percorrer? ");
        float km = scanner.nextFloat();
        scanner.close();

        float total; 

        if(km <= 200) {
            total = km * 0.5f;
            System.out.println("Preço da passagem R$" + total);
        } else {
            total = km * 0.4f;
            System.out.println("Precço da passagem R$" + total);
        }
    }
}
