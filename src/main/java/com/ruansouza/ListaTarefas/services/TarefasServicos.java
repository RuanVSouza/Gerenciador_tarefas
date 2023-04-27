package com.ruansouza.ListaTarefas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ruansouza.ListaTarefas.entidades.Tarefas;
import com.ruansouza.ListaTarefas.repositorios.TarefasRepositorio;

@Component
public class TarefasServicos {

	@Autowired
	private TarefasRepositorio tafrep;
	
	public List<Tarefas> findAll() {
		return tafrep.findAll();
	}
	
	public Tarefas findById(Long id){
		Optional<Tarefas> obj = tafrep.findById(id);
		return obj.get();
		}

}
