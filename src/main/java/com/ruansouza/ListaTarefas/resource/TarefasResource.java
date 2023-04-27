package com.ruansouza.ListaTarefas.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ruansouza.ListaTarefas.entidades.Tarefas;
import com.ruansouza.ListaTarefas.services.TarefasServicos;

@RestController
@RequestMapping(value = "/tarefas")
public class TarefasResource {

	@Autowired
	private TarefasServicos service;
	
	@GetMapping
	public ResponseEntity<List<Tarefas>> findAll(){
		List<Tarefas> list =  service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Tarefas> findById(@PathVariable Long id){
		Tarefas obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}


	
}
