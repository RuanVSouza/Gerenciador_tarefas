package com.ruansouza.ListaTarefas.resource;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ruansouza.ListaTarefas.entidades.Tarefas;
import com.ruansouza.ListaTarefas.entidades.enuns.AtividadesStatus;

@RestController
@RequestMapping(value = "/tarefas")
public class TarefasResource {

	@GetMapping
	public ResponseEntity<Tarefas> findAll() throws ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat("dd/HH/yyyy");
		
		
		Tarefas t1 = new Tarefas(null,"academia", "ir para a academia", sdf.parse("27/04/2023"),sdf.parse("27/04/2023Z"),AtividadesStatus.NAO_INICIADO);
		return ResponseEntity.ok().body(t1);
	}
	
}
