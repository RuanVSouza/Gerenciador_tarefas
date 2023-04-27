package com.ruansouza.ListaTarefas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Component;

import com.ruansouza.ListaTarefas.entidades.Tarefas;
import com.ruansouza.ListaTarefas.repositorios.TarefasRepositorio;
import com.ruansouza.ListaTarefas.resources.exceptions.DataBaseException;
import com.ruansouza.ListaTarefas.services.exceptions.ResourceNotFoundException;

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
	
	
	public Tarefas insert(Tarefas obj) {
		return tafrep.save(obj);
	}
	
	
	public void delete(Long id) {
		try {
			tafrep.deleteById(id);
		}
		catch(EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException(id);
		}catch(DataIntegrityViolationException e) {
			throw new DataBaseException(e.getMessage());
		}
	}

	
	public Tarefas update(Long id, Tarefas obj) {
		try{
			Tarefas entity = tafrep.getReferenceById(id);
		
		updateData(entity, obj);
		return tafrep.save(entity);
	}
		catch (ResourceNotFoundException e) {
			throw new ResourceNotFoundException(id);
		}
	}
	
	
	private void updateData(Tarefas entity, Tarefas obj) {
		entity.setNome(obj.getNome());
		entity.setDescricao(obj.getDescricao());
		entity.setComeco(obj.getComeco());
		entity.setTermino(obj.getTermino());
		entity.setStatus(obj.getStatus());
	
	}
	
	
	
}
