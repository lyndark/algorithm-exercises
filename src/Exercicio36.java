package src;

/* Uma empresa precisa reajustar o salário dos seus funcionários, dando um 
aumento de acordo com alguns fatores. Faça um programa que leia o salário atual, 
o gênero do funcionário e há quantos anos esse funcionário trabalha na empresa. 
No final, mostre o seu novo salário, baseado na tabela a seguir:
- Mulheres
 - menos de 15 anos de empresa: +5%
 - de 15 até 20 anos de empresa: +12%
 - mais de 20 anos de empresa: +23%
- Homens
 - menos de 20 anos de empresa: +3%
 - de 20 até 30 anos de empresa: +13%
 - mais de 30 anos de empresa: +25%
*/

import java.util.Scanner;

public class Exercicio36 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Salário atual: R$");
        float currentSalary = scanner.nextFloat();

        System.out.print("Gênero '[1] Feminino' ou '[2] Masculino': ");
        int gender = scanner.nextInt();

        System.out.print("Quantos anos na empresa? ");
        float yearsInTheCompany = scanner.nextFloat();

        scanner.close();

        float newSalary;
        
        if (gender == 1) {
            if (yearsInTheCompany > 20) {
                newSalary = currentSalary + (currentSalary * 0.23f);
                System.out.println("Novo salário: R$" + newSalary);
            }
            if ((yearsInTheCompany >= 15) && (yearsInTheCompany <= 20)) {
                newSalary = currentSalary + (currentSalary * 0.12f);
                System.out.println("Novo salário: R$" + newSalary);
            }
            if (yearsInTheCompany < 15) {
                newSalary = currentSalary + (currentSalary * 0.05f);
                System.out.println("Novo salário: R$" + newSalary);
            }
        }
        if (gender == 2) {
            if (yearsInTheCompany > 30) {
                newSalary = currentSalary + (currentSalary * 0.25f);
                System.out.println("Novo salário: R$" + newSalary);
            }
            if ((yearsInTheCompany >= 20) && (yearsInTheCompany <= 30)) {
                newSalary = currentSalary + (currentSalary * 0.13f);
                System.out.println("Novo salário: R$" + newSalary);
            }
            if (yearsInTheCompany < 20) {
                newSalary = currentSalary + (currentSalary * 0.03f);
                System.out.println("Novo salário: R$" + newSalary);
            }
        }
    }
}
