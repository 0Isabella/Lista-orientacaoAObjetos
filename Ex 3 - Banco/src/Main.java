public class Main {
    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria();

        while(true){
            conta.printTexto("----------");
            conta.printTexto("Escolha uma opção entre: ");
            conta.printTexto("> 1 - Depósito");
            conta.printTexto("> 2 - Saque");
            conta.printTexto("> 3 - Acessar saque");
            conta.printTexto("> 4 - Sair");
            int opcao = conta.InputInt("Digite a opção: ");

            switch (opcao){
                case 1 -> conta.depositar();
                case 2 -> conta.sacar();
                case 3 -> conta.retornarSaldo();
                case 4 -> {
                    conta.printTexto("Saindo do sistema");
                    return;
                }
                default -> conta.printTexto("Opção inválida");
            }
        }
    }
}