import java.util.ArrayList;
import java.util.List;

public class Biblioteca  {
    private static List<Livro> livros;

    public Biblioteca(){
        livros = new ArrayList<>();
    }

    public static void adicionarLivros(String titulo, String autor) {
        Livro novoLivro = new Livro(titulo, autor);
        livros.add(novoLivro);
        System.out.println("Livro adicionado à biblioteca " + titulo);
    }

    public void listarLivros(){
        if(livros.isEmpty()){
            System.out.println("Biblioteca vazia");
        } else {
            System.out.println("Livros disponíveis");
            for (Livro livro : livros){
                if (livro.isDisponivel()){
                    System.out.println(" - " + livro.getTitulo() + "de " + livro.getAutor());
                }
            }
        }
    }

    public void alugarLivro(String titulo) {
        for(Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                livro.alugar();
                return;
            }
        }
        System.out.println("Livro " + titulo + "não encontrado");
    }
}
