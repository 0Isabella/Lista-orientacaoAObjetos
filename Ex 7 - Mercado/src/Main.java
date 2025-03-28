public class Main {
    public static void main(String[] args) {

    Produto produtos = new Produto();
    Produto[] estoque = new Produto[20];
    int i;

    while (true) {
        produtos.printTexto("\n---------- MENU ----------");
        produtos.printTexto("Escolha uma opção entre: ");
        produtos.printTexto("> 1 - Adicionar produto");
        produtos.printTexto("> 2 - Atualizar as informações de um produto existente");
        produtos.printTexto("> 3 - Remover produto do estoque");
        produtos.printTexto("> 4 - Gerar relatório sobre o estoque atual");
        produtos.printTexto("> 5 - Sair");
        int opcao = produtos.inputInt("Escolha: ");

        switch (opcao) {
            case 1 -> produtos.adicionarProduto();
            case 2 -> produtos.atualizarProduto();
            case 3 -> produtos.removerProduto();
            case 4 -> produtos.mostrarEstoque();
                case 5 -> {
                    produtos.printTexto("Saindo do sistema");
                    return;
                }
                default -> produtos.printTexto("Opção inválida");
            }
        }
    }
}
