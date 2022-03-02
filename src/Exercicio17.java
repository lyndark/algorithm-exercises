package src;

/* Escreva um programa que pergunte a velocidade de um carro. Caso ultrapasse 
80Km/h, exiba uma mensagem dizendo que o usuário foi multado. Nesse caso, exiba 
o valor da multa, cobrando R$5 por cada Km acima da velocidade permitida. */

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual a velocidade do carro? ");
        float carSpeed = scanner.nextFloat();

        scanner.close();

        float fineForSpeed = ( carSpeed - 80 ) * 5;

        if (carSpeed > 80) {
            System.out.println("Velocidade acima do permitido.");
            System.out.println("VOCÊ FOI MULTADO EM R$" + fineForSpeed);
        } else {
            System.out.println("Velocidade permitida, pode prosseguir!");
        }
    }
}
