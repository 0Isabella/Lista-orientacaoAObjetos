import java.util.Scanner;

public class JogadorNivel {
    private Jogador[] jogadors;
    private int con;
    private InputHelp inputHelper;

    public JogadorNivel() {
        jogadors = new Jogador[5];
        con = 0;
        inputHelper = new InputHelp();
    }

    public void cadastrarJogador() {
        if (con < jogadors.length) {
            inputHelper.InputText("------------------");
            inputHelper.InputText(" Cadastro do Jogador " + (con + 1));
            String nome = inputHelper.InputString("Digite o nome do jogador: ");
            String nivel = inputHelper.InputString("Digite o nivel: ");
            int pont = inputHelper.InputInt("Digite a pontuacao: ");
            inputHelper.InputText("------------------");

            Jogador jogador = new Jogador(nome, nivel, pont);
            jogadors[con] = jogador;
            con++;
        } else {
            inputHelper.InputText("Limite de jogadores atingido.");
            inputHelper.InputText("------------------");
        }
    }

    public void exibirJogadores() {
        if (con == 0) {
            inputHelper.InputText("Nenhum jogador cadastrado.");
            inputHelper.InputText("------------------");
        } else {
            inputHelper.InputText("Lista de jogadores:");
            inputHelper.InputText("------------------");
            for (int i = 0; i < con; i++) {
                inputHelper.InputText("Jogador " + (i + 1) + ":");
                jogadors[i].exibirInfo();
                inputHelper.InputText("------------------");
            }
        }
    }

    public void atualizarJogador() {
        if (con > 0) {
            int indice = inputHelper.InputInt("Digite o indice do jogador que deseja atualizar (1 a " + con + "): ") - 1;
            if (indice >= 0 && indice < con) {
                int pontos = inputHelper.InputInt("Digite a pontuacao para adicionar: ");
                jogadors[indice].AlPont(pontos);
                String nivel = inputHelper.InputString("Digite o novo nivel: ");
                jogadors[indice].setNivel(nivel);
                inputHelper.InputText("Jogador atualizado com sucesso!");
                inputHelper.InputText("------------------");
            }
        } else {
            inputHelper.InputText("Nenhum jogador cadastrado.");
            inputHelper.InputText("------------------");
        }
    }
}