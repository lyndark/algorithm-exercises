package src;

/* Faça um programa que leia a largura e o comprimento de um terreno 
retangular, calculando e mostrando a sua área em m². O programa também 
deve mostrar a classificação desse terreno, de acordo com a lista abaixo:
 - Abaixo de 100m² = TERRENO POPULAR
 - Entre 100m² e 500m² = TERRENO MASTER
 - Acima de 500m² = TERRENO VIP */

 import java.util.Scanner;

public class Exercicio28 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); 

        System.out.print("Largura do terreno: ");
        float width = scanner.nextFloat();

        System.out.print("Comprimento do terreno: ");
        float length = scanner.nextFloat();

        scanner.close();

        float total = width * length;

        if(total >= 500){
            System.out.println("TERRENO VIP");
        } else if ((total >=100) && (total < 500)){
            System.out.println("TERRENO MASTER");
        } else {
            System.out.println("TERRENO POPULAR");
        }
    }
}
