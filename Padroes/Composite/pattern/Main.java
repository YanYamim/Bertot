package Composite.pattern;

public class Main {
    public static void main(String[] args) {
        Component arquivo1 = new Arquivo("documento.txt");
        Component arquivo2 = new Arquivo("foto.jpg");
        Component arquivo3 = new Arquivo("musica.mp3");

        Pasta pasta1 = new Pasta("Documentos");
        Pasta pasta2 = new Pasta("Mídia");

        pasta1.adicionar(arquivo1);
        pasta2.adicionar(arquivo2);
        pasta2.adicionar(arquivo3);

        Pasta raiz = new Pasta("Raiz");
        raiz.adicionar(pasta1);
        raiz.adicionar(pasta2);

        raiz.mostrar();
    }
}
