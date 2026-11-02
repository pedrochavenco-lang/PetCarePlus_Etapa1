package br.com.petcareplus.model;

public class Veterinario {

    private final int id;
    private final String nome;
    private final String crmv;

    public Veterinario(int id, String nome, String crmv) {
        if (id <= 0) {
            throw new IllegalArgumentException("ID deve ser positivo.");
        }

        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome obrigatório.");
        }

        if (crmv == null || crmv.isBlank()) {
            throw new IllegalArgumentException("CRMV obrigatório.");
        }

        this.id = id;
        this.nome = nome;
        this.crmv = crmv;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCrmv() {
        return crmv;
    }

    @Override
    public String toString() {
        return "Veterinario{id=" + id
                + ", nome='" + nome
                + "', crmv='" + crmv + "'}";
    }
}