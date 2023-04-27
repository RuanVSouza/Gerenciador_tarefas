package com.ruansouza.ListaTarefas.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.ruansouza.ListaTarefas.entidades.Tarefas;
import com.ruansouza.ListaTarefas.entidades.enuns.AtividadesStatus;
import com.ruansouza.ListaTarefas.repositorios.TarefasRepositorio;

@Configuration
@Profile("test")
public class PerfilTeste implements CommandLineRunner{

	@Autowired
	private TarefasRepositorio tafRep;
	
	
	@Override
	public void run(String... args) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/HH/yyyy");
		
		Tarefas t1 = new Tarefas(null,"academia", "ir para a academia", sdf.parse("27/04/2023"),sdf.parse("27/04/2023Z"),AtividadesStatus.NAO_INICIADO);
		Tarefas t2 = new Tarefas(null,"estudar", "Estudar", sdf.parse("28/04/2023"),sdf.parse("29/04/2023Z"),AtividadesStatus.NAO_INICIADO);

		tafRep.saveAll(Arrays.asList(t1,t2));
		
	}
	
}
