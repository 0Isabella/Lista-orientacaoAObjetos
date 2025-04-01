import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Agenda {
    private static Map<String, Contato> contatos;
    InputHelp inputHelper = new InputHelp();

    public Agenda() {
        this.contatos = new HashMap<>();
    }

    public void adicionarContato(Contato contato) {

        contatos.put(contato.getNome(), contato);
    }

    public static Contato buscar(String nome) {
        return contatos.get(nome);
    }

    public void removerContato(String nome) {

        contatos.remove(nome);
    }

    public void exibirAgenda() {
        if (contatos.isEmpty()) {
            inputHelper.InputString ("Agenda vazia.");
        } else {
            for (Contato contato : contatos.values()) {
                contato.exibirContato();
            }
        }
    }

    public void agenda(InputHelp inputHelper){
        String nome = inputHelper.InputString("Digite o nome do contato: ");
        int tel = inputHelper.InputInt("Digite o telefone do contato: ");
        Contato contato = new Contato(nome, tel);
        adicionarContato(contato);
    }

    public void contatos(){
        String nomeBusca = inputHelper.InputString("Digite o nome do contato que deseja buscar: ");
        Contato contatoEncontrado = Agenda.buscar(nomeBusca);
        if (contatoEncontrado != null) {
            inputHelper.InputString("Contato encontrado (de enter)");
            contatoEncontrado.exibirContato();
        } else {
            inputHelper.InputString("Contato não encontrado(de enter)");
        }

    }

}