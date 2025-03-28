import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

     Scanner leitor = new Scanner(System.in);
     ClasseInput livro = new ClasseInput();

        while (true) {
            livro.printTexto("Escolha uma opção");
            livro.printTexto("1 - Inserir livro");
            livro.printTexto("2 - Acessar livro");
            livro.printTexto("3 - Sair");
            int opcao = livro.InputInt("Opção: ");

            // int opcao = leitor.nextInt();

            switch (opcao){
                case 1 -> livro.cadastrarLivro();
                case 2 -> livro.exibirLivros();
                case 3 -> {
                    livro.printTexto("Saindo do sistema");
                    return;
                }
                default -> livro.printTexto("Opção inválida");
            }
        }
    }
}