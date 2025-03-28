import java.util.Scanner;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private String placa;
    private int velocidadeAtual;

    private static Carro[] carros = new Carro[5];
    private static int quantidadeCarros = 0;

    static Scanner leitor = new Scanner(System.in);

    public Carro(String marca, String modelo, int ano, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.velocidadeAtual = 0;
    }

    public Carro() {
    }

    public static void printTexto(String mensagem) {
        System.out.println(mensagem);
    }

    public static int inputInt(String mensagem) {
        System.out.print(mensagem);
        int num = leitor.nextInt();
        leitor.nextLine();
        return num;
    }

    public static String inputString(String mensagem) {
        System.out.print(mensagem);
        String frase = leitor.nextLine();
        return frase;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public static void adicionarCarro() {
        if (quantidadeCarros >= 5) {
            printTexto("Limite máximo de 5 carros atingido!");
            return;
        }

        String marca = inputString("Insira a marca: ");
        String modelo = inputString("Insira o modelo: ");
        int ano = inputInt("Insira o ano: ");
        String placa = inputString("Insira a placa: ");

        carros[quantidadeCarros] = new Carro(marca, modelo, ano, placa);
        quantidadeCarros++;
        printTexto("Carro adicionado! Total: " + quantidadeCarros + "/5");
    }


    public static Carro escolherCarro() {
        if (quantidadeCarros == 0) {
            printTexto("Nenhum carro cadastrado!");
            return null;
        }
        printTexto("Qual carro deseja escolher?");
        for (int i = 0; i < quantidadeCarros; i++) {

            printTexto((i + 1) + " - Modelo: " + carros[i].getModelo() + ", Marca: " + carros[i].getMarca());
        }
        int escolha = inputInt("Digite o número do carro escolhido: ");
        if (escolha < 1 || escolha > quantidadeCarros) {
            printTexto("Escolha inválida!");
            return null;
        }
        return carros[escolha - 1];
    }
        public void acelerar () {
            int velocidadeMaxima = 100;
            int continuar = 0;

            while (true) {


                if (velocidadeAtual >= velocidadeMaxima) {
                    printTexto("Muito rápido! Descalerando para a velocidade máxima de 100 km/h");
                    velocidadeAtual = velocidadeMaxima;
                    return;
                } else {
                    printTexto("\nO carro está acelerando");
                    velocidadeAtual += 10;
                    printTexto("Velocidade atual: " + velocidadeAtual + " km/h");
                }

                continuar = inputInt("Deseja continuar acelerando? \nSim (0) Não(1): ");

                if (continuar == 1) {
                    printTexto("Parando de acelerar, velocidade atual: " + velocidadeAtual);
                    return;
                }
            }
        }

        public void frear () {
            int velocidadeMinima = 0;
            int continuar = 0;

            while (true) {


                if (velocidadeAtual <= velocidadeMinima) {
                    printTexto("O carro está parado! Não é possível desacelerar mais");
                    velocidadeAtual = velocidadeMinima;
                    return;
                } else {
                    printTexto("\nO carro está freando");
                    velocidadeAtual -= 10;
                    printTexto("Velocidade atual: " + velocidadeAtual + "km/h");
                }

                continuar = inputInt("Deseja continuar freando? \nSim (0) Não(1): ");
                if (continuar == 1) {
                    printTexto("Parando de frear, velocidade atual: " + velocidadeAtual);
                    return;
                }
            }
        }

        public void mostrarInformacoes () {
            printTexto("\nInformações do Carro:");
            printTexto("Marca: " + marca);
            printTexto("Modelo: " + modelo);
            printTexto("Ano: " + ano);
            printTexto("Placa: " + placa);
            printTexto("Velocidade Atual: " + velocidadeAtual + " km/h\n");
        }

        public Carro[] getCarros () {
            return carros;
        }

        public void setCarros (Carro[]carros){
            this.carros = carros;
        }

        public int getQuantidadeCarros () {
            return quantidadeCarros;
        }

        public void setQuantidadeCarros ( int quantidadeCarros){
            this.quantidadeCarros = quantidadeCarros;
        }
    }



