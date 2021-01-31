package com.ikramdg.domain;

import java.util.Arrays;

import com.ikramdg.exceptions.NoSuchElementException;

public class StackImplementation<T> implements Stack<T> {

	private int size;
	private Object[] objectItems;
	private static final int DEFAULT_CAPACİTY = 1 << 3;
	private static final Object[] DEFAULT_ITEMS = {};

	public StackImplementation() {
		objectItems = DEFAULT_ITEMS;
	}

	@Override
	public T peek() {
		return (T) objectItems[size];
	}

	@Override
	public T pop() {
		if (size == 0)
			throw new NoSuchElementException();
		T value = (T) objectItems[size];
		objectItems[size--] = null;
		return value;

	}

	@Override
	public void push(T value) {
		if (objectItems == null || size >= (objectItems.length - 1)) {
			grow();
		}
		objectItems[++size] = value;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	private void grow() {
		int oldCapacity = Math.max(objectItems.length, DEFAULT_CAPACİTY);
		int newCapacity = oldCapacity << 1;
		objectItems = Arrays.copyOf(objectItems, newCapacity);

	}

}
