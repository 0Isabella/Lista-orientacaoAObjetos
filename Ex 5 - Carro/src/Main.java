public class Main {
    public static void main(String[] args) {

        Carro carro = new Carro();
        Carro carroSelecionado = null;

        while (true) {
            carro.printTexto("\n----------");
            carro.printTexto("Escolha uma opção entre: ");
            carro.printTexto("> 1 - Adicionar carro");
            carro.printTexto("> 2 - Escolher carro");
            carro.printTexto("> 3 - Ver informações do carro");
            carro.printTexto("> 4 - Entrar no carro");
            carro.printTexto("----------");
            int opcao = carro.inputInt("Digite a opção: ");
            carro.printTexto("----------");

            switch (opcao) {
                case 1 -> Carro.adicionarCarro();
                case 2 -> carroSelecionado = Carro.escolherCarro();
                case 3 -> {
                    if (carroSelecionado != null) {
                        carroSelecionado.mostrarInformacoes();
                    } else {
                        Carro.printTexto("Nenhum carro selecionado!");
                    }
                }
                case 4 -> {
                    if (carroSelecionado != null) {
                        while (true) {
                            Carro.printTexto("\n----------");
                            Carro.printTexto("Menu de Direção:");
                            Carro.printTexto("1 - Acelerar");
                            Carro.printTexto("2 - Frear");
                            Carro.printTexto("3 - Ver informações do carro");
                            Carro.printTexto("4 - Sair do carro");
                            Carro.printTexto("> 5 - Sair do sistema");
                            Carro.printTexto("----------");

                            int opcaoDirecao = Carro.inputInt("Digite a opção: ");

                            switch (opcaoDirecao) {
                                case 1 -> carroSelecionado.acelerar();
                                case 2 -> carroSelecionado.frear();
                                case 3 -> carroSelecionado.mostrarInformacoes();
                                case 4 -> {
                                    Carro.printTexto("Saindo do carro...");
                                }
                                default -> Carro.printTexto("Opção inválida!");
                            }

                            if (opcaoDirecao == 4) break;
                        }
                    } else {
                        Carro.printTexto("Nenhum carro selecionado!");
                    }
                }
                case 5 -> {
                    Carro.printTexto("Saindo");
                    return;
                }
                default -> Carro.printTexto("Opção inválida!");
            }
        }
    }
}
