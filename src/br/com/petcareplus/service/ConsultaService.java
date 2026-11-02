package br.com.petcareplus.service;

import br.com.petcareplus.model.Animal;
import br.com.petcareplus.model.Consulta;
import br.com.petcareplus.model.Veterinario;
import br.com.petcareplus.repository.Repositorio;
import java.time.LocalDateTime;
import java.util.List;

public class ConsultaService {

    private final Repositorio<Consulta> repositorio;

    public ConsultaService(Repositorio<Consulta> repositorio) {
        if (repositorio == null) {
            throw new IllegalArgumentException(
                    "Repositório obrigatório.");
        }

        this.repositorio = repositorio;
    }

    public Consulta agendar(int id, Animal animal,
                            Veterinario veterinario,
                            LocalDateTime dataHora,
                            String descricao) {

        Consulta consulta = new Consulta(
                id, animal, veterinario, dataHora, descricao);

        repositorio.salvar(consulta);

        return consulta;
    }

    public List<Consulta> listarConsultas() {
        return repositorio.listarTodos();
    }
}