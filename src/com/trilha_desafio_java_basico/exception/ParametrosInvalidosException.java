package com.trilha_desafio_java_basico.exception;

public class ParametrosInvalidosException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	public String toString() {
		return "O segundo parâmetro deve ser maior que o primeiro";
	}

}
