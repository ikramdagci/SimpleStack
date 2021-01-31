package com.ikramdg.domain;

public interface Stack<T> {

	T peek();

	T pop();

	void push(T value);

	boolean isEmpty();

}
