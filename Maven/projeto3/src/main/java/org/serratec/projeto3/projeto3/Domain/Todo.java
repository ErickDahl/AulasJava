package org.serratec.projeto3.projeto3.Domain;

public class Todo {
    private int id;
    private String titulo, descricao;
    private boolean completada;

    public Todo(int id, String titulo, String descricao, boolean completada) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.completada = completada;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }  
}