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

    public void alugar() {
        if (disponivel) {
            disponivel = false;
            System.out.println("Livro '" + titulo + "' alugado com sucesso!");
        } else {
            System.out.println("Este livro já está alugado!");
        }
    }

    public void devolver() {
        if (!disponivel) {
            disponivel = true;
            System.out.println("Livro '" + titulo + "' devolvido com sucesso!");
        } else {
            System.out.println("Este livro já está disponível na biblioteca!");
        }
    }
}