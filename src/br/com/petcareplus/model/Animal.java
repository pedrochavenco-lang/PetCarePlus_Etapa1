package br.com.petcareplus.model;

public class Animal {

    private final int id;
    private final String nome;
    private final String especie;
    private final Cliente cliente;

    public Animal(int id, String nome, String especie, Cliente cliente) {
        if (id <= 0) {
            throw new IllegalArgumentException("ID deve ser positivo.");
        }

        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome do animal obrigatório.");
        }

        if (especie == null || especie.isBlank()) {
            throw new IllegalArgumentException("Espécie obrigatória.");
        }

        if (cliente == null) {
            throw new IllegalArgumentException("Cliente obrigatório.");
        }

        this.id = id;
        this.nome = nome;
        this.especie = especie;
        this.cliente = cliente;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecie() {
        return especie;
    }

    public Cliente getCliente() {
        return cliente;
    }

    @Override
    public String toString() {
        return "Animal{id=" + id
                + ", nome='" + nome
                + "', especie='" + especie
                + "', responsavel='" + cliente.getNome() + "'}";
    }
}