package br.com.petcareplus.model;

import java.time.LocalDateTime;

public class Consulta {

    private final int id;
    private final Animal animal;
    private final Veterinario veterinario;
    private final LocalDateTime dataHora;
    private final String descricao;

    public Consulta(int id, Animal animal, Veterinario veterinario,
                    LocalDateTime dataHora, String descricao) {

        if (id <= 0) {
            throw new IllegalArgumentException("ID deve ser positivo.");
        }

        if (animal == null || veterinario == null || dataHora == null) {
            throw new IllegalArgumentException("Dados obrigatórios ausentes.");
        }

        this.id = id;
        this.animal = animal;
        this.veterinario = veterinario;
        this.dataHora = dataHora;
        this.descricao = descricao == null ? "" : descricao;
    }

    public int getId() {
        return id;
    }

    public Animal getAnimal() {
        return animal;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "Consulta{id=" + id
                + ", animal='" + animal.getNome()
                + "', veterinario='" + veterinario.getNome()
                + "', dataHora=" + dataHora
                + ", descricao='" + descricao + "'}";
    }
}