import java.util.Scanner;
public class ContaBancaria {

    Scanner leitor = new Scanner(System.in);

    private int numeroConta;
    private String nomeTitular;
    private int saldo;

    public ContaBancaria(){
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }

    public void printTexto(String mensagem) {
        System.out.println(mensagem);
    }

    public int InputInt(String mensagem) {
        System.out.print(mensagem);
        int num = leitor.nextInt();
        leitor.nextLine();
        return num;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getSaldo() {
        return saldo;
    }

    public void depositar(){
        int valor = InputInt("Digite a quantidade que deseja depositar: ");
        saldo = saldo + valor;
        printTexto("Depósito feito com sucesso!");
    }

    public void sacar(){
        int valor = InputInt("Digite a quantidade que deseja sacar: ");
        saldo = saldo - valor;
        printTexto("Saque feito com sucesso!");
    }

    public void retornarSaldo(){
        printTexto("Saldo atual: " + saldo);
    }

}
