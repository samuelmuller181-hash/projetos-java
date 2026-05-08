import java.util.Random;
import java.util.Scanner;

public class Projeto3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(10) + 1;
        int tentativa;

        System.out.println("=== JOGO DE ADIVINHAÇÃO ===");
        System.out.println("Tente adivinhar um número de 1 a 10");

        System.out.print("Digite seu palpite: ");
        tentativa = sc.nextInt();

        if (tentativa == numeroSecreto) {
            System.out.println("Parabéns! Você acertou!");
        } else {
            System.out.println("Você errou!");
            System.out.println("O número era: " + numeroSecreto);
        }

        sc.close();
    }
}