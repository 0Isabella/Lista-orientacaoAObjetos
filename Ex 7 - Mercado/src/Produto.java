import java.util.Scanner;

public class Produto {
    Scanner leitor = new Scanner(System.in);
    Produto[] estoque = new Produto[20];
    int quantidadeProdutos = 0;

    String nome;
    int codigo;
    int quantidadeEstoque;
    int preco;

    public Produto(String nome, int codigo, int quantidadeEstoque, int preco) {
        this.nome = nome;
        this.codigo = codigo;
        this.quantidadeEstoque = quantidadeEstoque;
        this.preco = preco;
    }

    public Produto() {
    }


    public void printTexto(String mensagem) {
        System.out.println(mensagem);
    }

    public int inputInt(String mensagem) {
        System.out.print(mensagem);
        int num = leitor.nextInt();
        leitor.nextLine();
        return num;
    }

    public String inputString(String mensagem) {
        System.out.print(mensagem);
        String frase = leitor.nextLine();
        return frase;
    }

    public void adicionarProduto() {
        if (quantidadeProdutos >= 20) {
            printTexto("\nLimite máximo de produtos atingido. Estoque cheio!");
            return;
        }

        String nome = inputString("\nDigite o nome do produto: ");
        int codigo = inputInt("Digite o código do produto: ");
        int quantidade = inputInt("Digite a quantidade em estoque: ");
        int preco = inputInt("Digite o preço do produto: ");

        estoque[quantidadeProdutos] = new Produto(nome, codigo, quantidade, preco);
        quantidadeProdutos++;

        printTexto("Produto adicionado. Total: " + quantidadeProdutos + "/20");
    }
    public void atualizarProduto() {
        if (quantidadeProdutos == 0) {
            printTexto("Estoque vazio! Não há produtos para atualizar.");
            return;
        }

        int codigoBusca = inputInt("\nDigite o código do produto que deseja atualizar: ");
        boolean encontrado = false;

        for (int i = 0; i < quantidadeProdutos; i++) {
            if (estoque[i].codigo == codigoBusca) {
                printTexto("\nProduto encontrado:");
                printTexto("Nome: " + estoque[i].nome);
                printTexto("Código: " + estoque[i].codigo);
                printTexto("Quantidade: " + estoque[i].quantidadeEstoque);
                printTexto("Preço: R$" + estoque[i].preco);

                printTexto("\nEscolha o que deseja atualizar:");
                printTexto("1 - Nome");
                printTexto("2 - Quantidade");
                printTexto("3 - Preço");
                printTexto("4 - Todos os campos");
                int opcao = inputInt("Digite a opção: ");

                switch (opcao) {
                    case 1 -> estoque[i].nome = inputString("Novo nome: ");
                    case 2 -> estoque[i].quantidadeEstoque = inputInt("Nova quantidade: ");
                    case 3 -> estoque[i].preco = inputInt("Novo preço: ");
                    case 4 -> {
                        estoque[i].nome = inputString("Novo nome: ");
                        estoque[i].quantidadeEstoque = inputInt("Nova quantidade: ");
                        estoque[i].preco = inputInt("Novo preço: ");
                    }
                    default -> printTexto("Opção inválida.");
                }

                printTexto("Produto atualizado com sucesso!");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            printTexto("Produto com código " + codigoBusca + " não encontrado.");
        }
    }


    public void removerProduto() {
        if (quantidadeProdutos == 0) {
            printTexto("Estoque vazio! Não há produtos para remover.");
            return;
        }

        int codigoBusca = inputInt("\nDigite o código do produto que deseja remover: ");
        boolean encontrado = false;

        for (int i = 0; i < quantidadeProdutos; i++) {
            if (estoque[i].codigo == codigoBusca) {
                printTexto("Removendo produto: " + estoque[i].nome);

                for (int j = i; j < quantidadeProdutos - 1; j++) {
                    estoque[j] = estoque[j + 1];
                }

                estoque[quantidadeProdutos - 1] = null;
                quantidadeProdutos--;
                printTexto("Produto removido com sucesso!");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            printTexto("Produto com código " + codigoBusca + " não encontrado.");
        }
    }


        public void mostrarEstoque() {
            if (quantidadeProdutos == 0) {
                printTexto("Estoque vazio!");
                return;
            }

            printTexto("\n==== ESTOQUE ====");
            for (int i = 0; i < quantidadeProdutos; i++) {
                printTexto("\nProduto n° " + (i+1));
                printTexto("Nome: " + estoque[i].nome);
                printTexto("Código: " + estoque[i].codigo);
                printTexto("Quantidade: " + estoque[i].quantidadeEstoque);
                printTexto("Preço: R$" + estoque[i].preco);
                printTexto("Valor total: R$" + (estoque[i].quantidadeEstoque * estoque[i].preco));
                printTexto("===========================");
            }
        }
    }
