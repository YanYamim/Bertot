package Composite.antiPattern;

public class Main {
    public static void main(String[] args) {
        Arquivo arquivo1 = new Arquivo("documento.txt");
        Arquivo arquivo2 = new Arquivo("foto.jpg");
        Arquivo arquivo3 = new Arquivo("musica.mp3");

        Pasta pasta1 = new Pasta("Documentos");
        Pasta pasta2 = new Pasta("Mídia");

        pasta1.adicionar(arquivo1);
        pasta2.adicionar(arquivo2);
        pasta2.adicionar(arquivo3);

        Pasta raiz = new Pasta("Raiz");
        raiz.adicionar(pasta1);
        raiz.adicionar(pasta2);

        raiz.mostrar();

        raiz.salvarNoBanco();
    }
}
