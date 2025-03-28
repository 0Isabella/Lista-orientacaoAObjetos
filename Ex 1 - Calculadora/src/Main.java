
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        while (true){
            calculadora.InputTexto("--------------------");
            calculadora.InputTexto("Escolha uma opção: ");
            calculadora.InputTexto("1 - Soma");
            calculadora.InputTexto("2 - Subtração");
            calculadora.InputTexto("3 - Multiplicação");
            calculadora.InputTexto("4 - Divisão");
            calculadora.InputTexto("5 - Sair");
            calculadora.InputTexto("Escolha uma opção: ");
            int opcao =  leitor.nextInt();
            calculadora.InputTexto("--------------------");

                switch (opcao){
                    case 1 -> calculadora.Soma();
                    case 2 -> calculadora.Subtracao();
                    case 3 -> calculadora.Mulitplicacao();
                    case 4 -> calculadora.Divisao();
                    case 5 -> {
                        calculadora.InputTexto("Saindo do sistema");
                        return;
                    }
                    default -> calculadora.InputTexto("Opção inválida");
                }
        }
    }
}
