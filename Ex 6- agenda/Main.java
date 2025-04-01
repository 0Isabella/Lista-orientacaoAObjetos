public class Main {
    public static void main(String[] args)  {
        Agenda agenda = new Agenda();
        InputHelp inputHelper = new InputHelp();


        while (true) {
            inputHelper.InputText("------------------");
            System.out.println("1. Adicionar contato");
            System.out.println("2. Buscar contato");
            System.out.println("3. Remover contato");
            System.out.println("4. Exibir agenda");
            inputHelper.InputText("5. Sair");
            int opcao = inputHelper.InputInt("Escolha uma opcao: ");
            inputHelper.InputText("------------------");

            switch (opcao) {
                case 1:
                    agenda.agenda(inputHelper);
                    inputHelper.InputText("------------------");
                    break;
                case 2:
                    agenda.contatos();
                    break;
                case 3:
                    String nomeRemover = inputHelper.InputString("Digite o nome do contato que deseja remover: ");
                    agenda.removerContato(nomeRemover);
                    inputHelper.InputString("Contato removodo");
                    inputHelper.InputText("------------------");
                    break;
                case 4:
                    agenda.exibirAgenda();
                    inputHelper.InputText("------------------");
                    break;
                case 5:
                    inputHelper.InputText("Saindo do sistema...");
                    return;
                default:
                    inputHelper.InputText("Opcao invalida.");
                    inputHelper.InputText("------------------");
            }
        }
    }
}