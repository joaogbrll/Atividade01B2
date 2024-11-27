import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idadePessoa1 = 23;
        double alturaPessoa1 = 1.98;
        String nomePessoa1 = " Eduardo ";
        boolean estudante = true;

        int idadePessoa2 = 21;
        double alturaPessoa2 = 1.69;
        int somaIdade = idadePessoa1 + idadePessoa2;
        double alturaDuplicada = alturaPessoa1 * 2;


        System.out.println("Olá, Eduardo");
        System.out.println("A soma das idade é " + somaIdade + " anos");
        System.out.println("A soma das alturas é " + alturaDuplicada + " metros");

    }
}