package org.Inventario;

class Item {
    private String nome;
    private String espaco;
    private int quantidade;

    public Item(String nome, String espaco, int quantidade) {
        this.nome = nome;
        this.espaco = espaco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public String getEspaco() {
        return espaco;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
