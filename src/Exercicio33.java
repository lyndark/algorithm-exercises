package src;

/* O Índice de Massa Corpórea (IMC) é um valor calculado baseado na altura e no 
peso de uma pessoa. De acordo com o valor do IMC, podemos classificar o 
indivíduo dentro de certas faixas.
 - abaixo de 18.5: Abaixo do peso
 - entre 18.5 e 25: Peso ideal
 - entre 25 e 30: Sobrepeso
 - entre 30 e 40: Obesidade
 - acima de 40: Obseidade mórbida
Obs: O IMC é calculado pela expressão peso/altura² (peso dividido pelo quadrado 
da altura) */

import java.util.Scanner;

public class Exercicio33 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Altura: ");
        float height = scanner.nextFloat();

        System.out.print("Peso: ");
        float weight = scanner.nextFloat();

        scanner.close();

        float imc = weight / (height * height);

        if ((imc >= 0) && (imc < 18.5)) {
            System.out.println("Abaixo do peso.");
        }
        if ((imc >= 18.5) && (imc < 25)) {
            System.out.println("Peso ideal");
        }
        if ((imc >= 25) && (imc < 30)) {
            System.out.println("Sobrepeso");
        }
        if ((imc >= 30) && (imc < 40)) {
            System.out.println("Obesidade");
        }
        if (imc > 40) {
            System.out.println("Obesidade mórbida");
        }
    }
}
