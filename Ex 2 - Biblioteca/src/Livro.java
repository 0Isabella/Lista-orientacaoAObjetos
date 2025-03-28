import java.util.Scanner;

public class Livro {

        private String titulo;
        private String autor;
        private int ano;


        public Livro(String titulo, String autor, int ano){
            this.titulo = titulo;
            this.autor = autor;
            this.ano = ano;
        }


        public void exibirInfo() {
            System.out.println("Título: " + titulo);
            System.out.println("Autor: " + autor);
            System.out.println("Ano: " + ano);
        }

}
