
import java.util.Scanner;

public class Calculadora {
    static Scanner leitor = new Scanner(System.in);

    public String InputString(String mensagem) {
        System.out.print(mensagem);
        return leitor.nextLine();
    }

    public String InputTexto(String mensagem) {
        System.out.println(mensagem);
        return mensagem;
    }


    public static void Soma() {
        System.out.print("Digite um número: ");
        int n1 = leitor.nextInt();
        System.out.print("Digite outro número: ");
        int n2 = leitor.nextInt();
        leitor.nextLine();
        System.out.print("A soma de " + n1 + " e " + n2 + " é " + (n1 + n2) + "\n");
    }

    public static void Subtracao() {
        System.out.print("Digite um número: ");
        int n1 = leitor.nextInt();
        System.out.print("Digite outro número: ");
        int n2 = leitor.nextInt();
        leitor.nextLine();
        System.out.print("A subtração de " + n1 + " e " + n2 + " é " + (n1 - n2) + "\n");
    }

    public static void Mulitplicacao() {
        System.out.print("Digite um número: ");
        int n1 = leitor.nextInt();
        System.out.print("Digite outro número: ");
        int n2 = leitor.nextInt();
        leitor.nextLine();
        System.out.print("A multiplicação de " + n1 + " e " + n2 + " é " + (n1 * n2) + "\n");
    }

    public static void Divisao() {
        System.out.print("Digite um número: ");
        int n1 = leitor.nextInt();
        System.out.print("Digite outro número: ");
        int n2 = leitor.nextInt();
        leitor.nextLine();
        if (n2 == 0) {
            System.out.print("Divisão inválida, digite um número diferente de 0 \n");
        } else {System.out.print("A divisão de " + n1 + " e " + n2 + " é " + (n1 / n2) + "\n");
        }

    }
}

