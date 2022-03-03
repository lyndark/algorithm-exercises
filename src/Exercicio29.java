package src;

/* Desenvolva um programa que leia o nome de um funcionário, seu salário, 
quantos anos ele trabalha na empresa e mostre seu novo salário, reajustado de 
acordo com a tabela a seguir:
 - Até 3 anos de empresa: aumento de 3%
 - entre 3 e 10 anos: aumento de 12.5%
 - 10 anos ou mais: aumento de 20% */

 import java.util.Scanner;

public class Exercicio29 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); 

        System.out.print("Nome do funcionário: ");
        String name = scanner.next();

        System.out.print("Salário R$");
        float wage = scanner.nextFloat();

        System.out.print("Quantos anos na empresa: ");
        float year = scanner.nextFloat();

        scanner.close();

        float total;
        
        if(year >= 10){
            total = wage + (wage * 0.2f); 
            System.out.println(name + ", você recebeu aumento de 20%");
            System.out.println("Salário atual R$" + total); 
        } else if ((year >= 3) && (year < 10)){
            total = wage + (wage * 0.125f); 
            System.out.println(name + ", você recebeu aumento de 12.5%");
            System.out.println("Salário atual R$" + total);
        } else { 
            total = wage + (wage * 0.03f); 
            System.out.println(name + ", você recebeu aumento de 3%");
            System.out.println("Salário atual R$" + total); 
        }
    }   
}
