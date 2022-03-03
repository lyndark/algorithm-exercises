package src;

/* [DESAFIO] Crie um jogo de JoKenPo (Pedra-Papel-Tesoura */

import java.util.Scanner;

public class Exercicio31 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("------------------------------");
        System.out.println("         REGRAS DO JOGO       ");
        System.out.println("------------------------------");
        System.out.println("    Pedra ganha da Tesoura;   ");
        System.out.println("    Tesoura ganha do Papel;   "); 
        System.out.println("    Papel ganha da Pedra;     ");
        System.out.println("------------------------------");

        System.out.print("\n");
        System.out.println("Jogador 1, escolha:");
        System.out.println(" '[1] Pedra' , '[2] Papel' e '[3] Tesoura'");
        int playerOne = scanner.nextInt();

        System.out.println("Jogador 2, escolha:");
        System.out.println(" '[1] Pedra' , '[2] Papel' e '[3] Tesoura'");
        int playerTwo = scanner.nextInt();

        scanner.close();

        if(playerOne == 1) {
            if (playerTwo == 1) {
                System.out.println("Empate");        
            }
            else if (playerTwo == 2) {
                System.out.println("Jogador 2 ganhou");        
            }
            else if (playerTwo == 3) {
                System.out.println("Jogador 1 ganhou");        
            }
        }
        else if(playerOne == 2) {
            if (playerTwo == 1) {
                System.out.println("JOgadpr 1 ganhou");        
            }
            else if (playerTwo == 2) {
                System.out.println("Empate");        
            }
            else if (playerTwo == 3) {
                System.out.println("Jogador 2 ganhou");        
            }
        }
        else if(playerOne == 3) {
            if (playerTwo == 1) {
                System.out.println("Jogador 2 ganhou");        
            }
            else if (playerTwo == 2) {
                System.out.println("Jogador 1 ganhou");        
            }
            else if (playerTwo == 3) {
                System.out.println("Empate");        
            }
        }  
    }
}
