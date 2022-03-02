package src;

/*Faça um programa que leia as duas notas de um aluno em uma matéria e mostre 
na tela a sua média na disciplina.
Ex: 
Nota 1: 4.5
Nota 2: 8.5
A média entre 4.5 e 8.5 é igual a 6.5 */

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nota 1: ");
        double noteOne = scanner.nextDouble();

        System.out.print("Nota 2: ");
        double noteTwo = scanner.nextDouble();

        double medium = (noteOne + noteTwo) / 2;

        System.out.println("A média entre " + noteOne + " e " + noteTwo + " é igual a " + medium);
    }
}
