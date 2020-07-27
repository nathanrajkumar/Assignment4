package com.coderscampus.arraylist;

public class CustomArrayList<T> implements CustomList<T> {
	int size = 10;
	Object[] items = new Object[size];
	int itemCounter = 0;

	@Override
	public boolean add(T item) {
		if (itemCounter == items.length) {
			items = extendArray();
		}		
		items[itemCounter] = item;
		itemCounter++;
		return true;
	}

	private Object[] extendArray() {
		size = items.length * 2;
//		System.out.println("Extend Array: " + size);
		Object[] newArray = new Object[size];
		for(int i = 0; i < items.length; i++) {
			newArray[i] = items[i];
		}
		return newArray;
	}

	@Override
	public int getSize() {
		return itemCounter;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) {
		return (T)items[index];
	}
	
}
