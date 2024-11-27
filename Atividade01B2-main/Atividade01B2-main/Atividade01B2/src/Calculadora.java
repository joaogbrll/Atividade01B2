import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro numero");
        int num1 = sc.nextInt();

        System.out.println("Digite o segundo numero");
        int num2 = sc.nextInt();

        System.out.println("Escolha a operação");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtracao");
        System.out.println("3 - Multiplicacao");
        System.out.println("4 - Divisao");
        int escolha = sc.nextInt();

        int resultadoSoma = num1 + num2;
        int resultadoSubtracao = num1 - num2;
        int resultadoMultiplicacao = num1 * num2;
        int resultadoDivisao = num1 / num2;
        if (escolha == 1) {
            System.out.println("Soma: " + resultadoSoma);
        }
        else if (escolha == 2) {
            System.out.println("Subtracao: " + resultadoSubtracao);
        }
        else if (escolha == 3) {
            System.out.println("Multiplicacao: " + resultadoMultiplicacao);
        }
        else if (escolha == 4) {
            System.out.println("Divisao: " + resultadoDivisao);
        }


        sc.close();


    }
    }

