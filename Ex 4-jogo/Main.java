public class Main {
    public static void main(String[] args) {
        JogadorNivel gerenciador = new JogadorNivel();
        InputHelp inputHelper = new InputHelp();

        while (true) {
            inputHelper.InputText("------------------");
            inputHelper.InputText("Escolha uma opção");
            inputHelper.InputText("1. Cadastrar jogador");
            inputHelper.InputText("2. Exibir jogadores");
            inputHelper.InputText("3. Atualizar jogador");
            inputHelper.InputText("4. Sair");
            int opcao = inputHelper.InputInt("Escolha uma opcao: ");
            inputHelper.InputText("------------------");

            switch (opcao) {
                case 1:
                    gerenciador.cadastrarJogador();
                    inputHelper.InputText("------------------");
                    break;
                case 2:
                    gerenciador.exibirJogadores();
                    inputHelper.InputText("------------------");
                    break;
                case 3:
                    gerenciador.atualizarJogador();
                    inputHelper.InputText("------------------");
                    break;
                case 4:
                    inputHelper.InputText("Saindo do sistema...");
                    return;
                default:
                    inputHelper.InputText("Opcao invalida.");
                    inputHelper.InputText("------------------");
            }
        }
    }
}