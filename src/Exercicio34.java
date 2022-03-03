package src;

/* Uma empresa de aluguel de carros precisa cobrar pelos seus serviços. O 
aluguel de um carro custa R$90 por dia para carro popular e R$150 por dia para 
carro de luxo. Além disso, o cliente paga por Km percorrido. Faça um programa
que leia o tipo de carro alugado (popular ou luxo), quantos dias de aluguel e 
quantos Km foram percorridos. No final mostre o preço a ser pago de acordo com a 
tabela a seguir:
 - Carros populares (aluguel de R$90 por dia)
 - Até 100Km percorridos: R$0,20 por Km
 - Acima de 100Km percorridos: R$0,10 por Km
 - Carros de luxo (aluguel de R$150 por dia)
 - Até 200Km percorridos: R$0,30 por Km
 - Acima de 200Km percorridos: R$0,25 por Km */

import java.util.Scanner;

public class Exercicio34 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual carro '[1] Popular' ou '[2] Luxo': ");
        int typeOfCar = scanner.nextInt();

        System.out.print("Quantos dias de aluguel: ");
        int rentalDays = scanner.nextInt();

        System.out.print("Quantos Km foram percorridos: ");
        float km = scanner.nextFloat();
        
        scanner.close();
        
        float total;

        if (typeOfCar == 1) {
            if (km <= 100) {
                total = (rentalDays * 90) + (km * 0.2f);
                System.out.println("Valor a pagar: R$" + total);
            }
            if (km > 100) {
                total = (rentalDays * 90) + (km * 0.1f);
                System.out.println("Valor a pagar: R$" + total);
            }
        }
        if (typeOfCar == 2) {
            if (km <= 200) {
                total = (rentalDays * 150) + (km * 0.30f);
                System.out.println("Valor a pagar: R$" + total);
            }

            if (km > 200) {
                total = (rentalDays * 150) + (km * 0.25f);
                System.out.println("Valor a pagar: R$" + total);
            }
        }
    }
}
