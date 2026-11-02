package br.com.petcareplus.repository;

import br.com.petcareplus.model.Consulta;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class RepositorioConsultaMemoria
        implements Repositorio<Consulta> {

    private final Map<Integer, Consulta> consultas =
            new LinkedHashMap<>();

    @Override
    public void salvar(Consulta consulta) {
        if (consulta == null) {
            throw new IllegalArgumentException(
                    "Consulta não pode ser nula.");
        }

        consultas.put(consulta.getId(), consulta);
    }

    @Override
    public Optional<Consulta> buscarPorId(int id) {
        return Optional.ofNullable(consultas.get(id));
    }

    @Override
    public List<Consulta> listarTodos() {
        return new ArrayList<>(consultas.values());
    }
}