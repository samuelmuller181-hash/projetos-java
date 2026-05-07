import java.util.Scanner;

public class Projeto2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double numero1;
        double numero2;
        double resultado;
        int opcao;

        System.out.println("=== CALCULADORA ===");

        System.out.print("Digite o primeiro número: ");
        numero1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        numero2 = sc.nextDouble();

        System.out.println("\nEscolha uma operação:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");

        System.out.print("Opção: ");
        opcao = sc.nextInt();

        switch(opcao) {

            case 1:
                resultado = numero1 + numero2;
                System.out.println("Resultado: " + resultado);
                break;

            case 2:
                resultado = numero1 - numero2;
                System.out.println("Resultado: " + resultado);
                break;

            case 3:
                resultado = numero1 * numero2;
                System.out.println("Resultado: " + resultado);
                break;

            case 4:
                if(numero2 != 0) {
                    resultado = numero1 / numero2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Não é possível dividir por zero.");
                }
                break;

            default:
                System.out.println("Opção inválida.");
        }

        sc.close();
    }
}