package com.conversor.exceptions;

public class ErroValorInputInvalidoException extends NumberFormatException{

	private static final long serialVersionUID = 1L;
	private static final String mensagemErroConvercao = "O valor '%s' é inválido. Por favor informe apenas números";
	
	public ErroValorInputInvalidoException(Object valorInput) {
		super(String.format(mensagemErroConvercao, valorInput));
	}
	
}
