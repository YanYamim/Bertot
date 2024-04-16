import java.util.ArrayList;
import java.util.List;

public class Biblioteca  {
    private static List<Livro> livros;

    public Biblioteca(){
        livros = new ArrayList<>();
    }

    public static String adicionarLivros(String titulo, String autor) {
        Livro novoLivro = new Livro(titulo, autor);
        livros.add(novoLivro);
        return "Livro adicionado à biblioteca " + titulo;
    }

    public String listarLivros(){
        if(livros.isEmpty()){
            return "Biblioteca vazia";
        } else {
            StringBuilder livrosDisponiveis = new StringBuilder("Livros disponíveis\n");
            for (Livro livro : livros){
                if (livro.isDisponivel()){
                    livrosDisponiveis.append(" - ").append(livro.getTitulo()).append(" de ").append(livro.getAutor()).append("\n");
                }
            }
            return livrosDisponiveis.toString();
        }
    }

    public String alugarLivro(String titulo) {
        for(Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                livro.alugar();
                return "Livro " + titulo + " alugado";
            }
        }
        return "Livro " + titulo + " não encontrado";
    }

    public String devolverLivro(String titulo) {
        for(Livro livro : livros) {
            if (livro.getTitulo().equals(titulo)) {
                livro.devolver();
                return "Livro " + titulo + " foi devolvido";
            }
        }
        return "O livro " + "está para ser devolvido";
    }
}
