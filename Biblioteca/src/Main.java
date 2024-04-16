public class Main {
    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();
        Biblioteca.adicionarLivros("Dom Quixote", "Miguel de Cervantes");
        Biblioteca.adicionarLivros("O Senhor dos Anéis", "J.R.R. Tolkien");
        Biblioteca.adicionarLivros("O Hobbit", "J.R.R. Tolkien");
        Biblioteca.adicionarLivros("Harry Potter e o Priosioneiro de Azkaban", "J.K. Rowling");

        biblioteca.listarLivros();
    }
}
