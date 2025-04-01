public class Contato {
    private String nome;
    private int tel;

    public Contato(String nome, int tel) {
        this.nome = nome;
        this.tel = tel;
    }

    public String getNome() {

        return nome;
    }

    public int getTel() {

        return tel;
    }

    public void exibirContato() {
        System.out.println("Nome: " + nome);
        System.out.println("Telefone: " + tel);
    }
}