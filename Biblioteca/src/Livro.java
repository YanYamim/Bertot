class Livro {
    private String titulo;
    private String autor;
    private boolean disponivel;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public String alugar() {
        if (disponivel) {
            disponivel = false;
            return "Livro '" + titulo + "' alugado com sucesso!";
        } else {
            return "Este livro já está alugado!";
        }
    }

    public String devolver() {
        if (!disponivel) {
            disponivel = true;
            return "Livro '" + titulo + "' devolvido com sucesso!";
        } else {
            return "Este livro já está disponível na biblioteca!";
        }
    }
}
