package com.ikramdg.exceptions;

public class NoSuchElementException extends RuntimeException{

	public NoSuchElementException() {
		super("No such element in stack!");
	}
}
