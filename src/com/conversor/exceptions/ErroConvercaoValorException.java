package com.conversor.exceptions;

public class ErroConvercaoValorException extends NumberFormatException{

	private static final long serialVersionUID = 1L;
	
	public ErroConvercaoValorException(String mensagem) {
		super(mensagem);
	}
	

}
