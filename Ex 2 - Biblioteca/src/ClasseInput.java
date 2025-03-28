import java.util.Scanner;

public class ClasseInput {
    static Scanner leitor = new Scanner(System.in);

    public String InputString(String mensagem) {
        System.out.print(mensagem);
        return leitor.nextLine();
    }

    public void printTexto(String mensagem) {
        System.out.println(mensagem);
    }

    public int InputInt(String mensagem) {
        System.out.println(mensagem);
        int num = leitor.nextInt();
        leitor.nextLine();
        return num;
    }

    private Livro[] funci;
    private int conFunc;
    private ClasseInput inputHelper;

    public void cadastrarLivro() {
        if (conFunc < funci.length) {
            String titulo = inputHelper.InputString("Digite o título do livro: ");
            String autor = inputHelper.InputString("Digite o autor do livro: ");
            int ano = inputHelper.InputInt("Digite o ano do livro: ");
            inputHelper.printTexto("------------------");

            Livro livro = new Livro(titulo, autor, ano);
            funci[conFunc] = livro;
            conFunc++;
        }
    }

    public void exibirLivros() {
        if (conFunc == 0) {
            inputHelper.printTexto("Nenhum livro cadastrado.");
            inputHelper.printTexto("------------------");
        } else {
            inputHelper.printTexto("Lista de Livros:");
            inputHelper.printTexto("------------------");
            for (int i = 0; i < conFunc; i++) {
                inputHelper.printTexto("Livro " + (i + 1) + ":");
                funci[i].exibirInfo();
                inputHelper.printTexto("------------------");
            }
        }
    }
}
