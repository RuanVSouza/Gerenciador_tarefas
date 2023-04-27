package com.ruansouza.ListaTarefas.entidades.enuns;

public enum AtividadesStatus {

	NAO_INICIADO(1),
	EM_ANDAMENTO(2),
	CONCLUIDO(3);
	
	private int code;

	
	private AtividadesStatus(int code) {
		this.code = code;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}
	
	public static AtividadesStatus situacao(int code) {
		for(AtividadesStatus value : AtividadesStatus.values()) {
			if(value.getCode() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("situação invalida");	}
	
}
