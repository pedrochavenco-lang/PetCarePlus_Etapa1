package br.com.petcareplus.repository;

import java.util.List;
import java.util.Optional;

public interface Repositorio<T> {

    void salvar(T entidade);

    Optional<T> buscarPorId(int id);

    List<T> listarTodos();
}