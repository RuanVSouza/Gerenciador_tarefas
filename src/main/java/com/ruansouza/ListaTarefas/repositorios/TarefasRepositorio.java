package com.ruansouza.ListaTarefas.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ruansouza.ListaTarefas.entidades.Tarefas;

public interface TarefasRepositorio extends JpaRepository<Tarefas, Long> {

}
