package br.com.petcareplus.model;

public class Cliente {

    private final int id;
    private final String nome;
    private final String telefone;

    public Cliente(int id, String nome, String telefone) {
        if (id <= 0) {
            throw new IllegalArgumentException("ID deve ser positivo.");
        }

        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome obrigatório.");
        }

        this.id = id;
        this.nome = nome;
        this.telefone = telefone == null ? "" : telefone;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    @Override
    public String toString() {
        return "Cliente{id=" + id
                + ", nome='" + nome
                + "', telefone='" + telefone + "'}";
    }
}