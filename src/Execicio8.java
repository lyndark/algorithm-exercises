package src;

/* Desenvolva um programa que leia uma distância em metros e mostre os valores 
relativos em outras medidas.
Ex: 
Digite uma distância em metros: 185.72
A distância de 85.7m corresponde a:
0.18572Km
1.8572Hm
18.572Dam
1857.2dm
18572.0cm
185720.0m */

import java.util.Scanner;

public class Execicio8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma distância em metros: ");
        double distance = scanner.nextDouble();

        scanner.close();

        double distanceKm = distance * 1000;
        double distanceHm = distance * 100;
        double distanceDm = distance * 10;
        double distanceCm = distance * 100;
        double distanceM = distance * 100;

        System.out.println("A distância de " + distance + "m corresponde a: ");
        System.out.println(distanceKm + "Km");
        System.out.println(distanceHm + "Hm");
        System.out.println(distanceDm + "Dm");
        System.out.println(distanceCm + "cm");
        System.out.println(distanceKm + "m");
    }
}
