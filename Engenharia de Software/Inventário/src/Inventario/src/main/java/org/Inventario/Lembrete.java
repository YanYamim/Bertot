package org.Inventario;

public class Lembrete {
    private String titulo;
    private String data;
    private String texto;

    public Lembrete(String titulo, String data, String texto) {
        this.titulo = titulo;
        this.data = data;
        this.texto = texto;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getData() {
        return data;
    }

    public String getTexto() {
        return texto;
    }
}