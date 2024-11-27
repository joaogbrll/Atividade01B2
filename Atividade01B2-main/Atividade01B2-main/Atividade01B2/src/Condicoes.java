import java.util.Scanner;

public class Condicoes {
    public static void main(String[] args) {
        // saber se é de maior//
        Scanner sc = new Scanner(System.in);
        int idade = 0;
        System.out.println("Digite sua idade: ");
        idade = sc.nextInt();
        if (idade >= 18) {
            System.out.println("Você é maior de idade");
        }
        else if (idade <= 17) {
            System.out.println("Você é menor de idade");
        }
        int notas = 0;
        System.out.println("Digite sua nota: ");
        notas = sc.nextInt();
        if (notas >= 9) {
            System.out.println("Sua nota é excelente");
            notas = sc.nextInt();}

        if (notas >= 7) {
            System.out.println("Sua nota é Boa");
            notas = sc.nextInt();}

        if (notas >= 5) {
            System.out.println("Sua nota é Satisfatória");
            notas = sc.nextInt();}

        if (notas < 5) {
            System.out.println("Sua nota é Insatisfatória");
            notas = sc.nextInt();
        }



    }
}
