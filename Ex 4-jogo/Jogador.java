public class Jogador {
    private String nome;
    private String nivel;
    private int Pont;

    public Jogador(String nome, String nivel, int Pont) {
        this.nome = nome;
        this.nivel = nivel;
        this.Pont = Pont;
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Nivel: " + nivel);
        System.out.println("Pontuação: " + Pont);
    }

    public int getPontuacao() {
        return Pont;
    }

    public void setPontuacao(int Pont) {
        this.Pont = Pont;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public void AlPont(int pontos) {
        this.Pont += pontos;
    }
}




