package com.algaworks.socialbooks.services.exceptions;

public class LivroNaoEncontradoException extends RuntimeException{
	
	

	/**
	 * 
	 */
	private static final long serialVersionUID = -7770446589668967258L;

	public LivroNaoEncontradoException(String mensagem){
		super(mensagem);
	}
	
	public LivroNaoEncontradoException(String mensagem, Throwable causa){
		super(mensagem, causa);
	}
	

}
