package com.conversor.exceptions;

public class ErroCancelamentoOperacao extends NullPointerException{
	
	private static final long serialVersionUID = 1L;

	public ErroCancelamentoOperacao() {
		super("Operação cancelada");
	}

}
