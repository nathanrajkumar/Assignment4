package com.coderscampus.arraylist;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];

	@Override
	public boolean add(T item) {
		if (this.getSize() == items.length) {
			extendArray();
		}
		for(int i = 0; i < items.length; i++) {
			if(items[i] == null) {
				items[i] = item;
				return true;
			}
		}
		return false;
	}

	private void extendArray() {
		Object[] newArray = new Object[items.length * 2];
		for(int i = 0; i < items.length; i++) {
			newArray[i] = items[i];
		}
		items = newArray;
	}

	@Override
	public int getSize() {
		int objectCounter = 0;
		for (Object item : items) {
			if(item != null) {
				objectCounter++;
			}
		}
		return objectCounter;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) {
		return (T)items[index];
	}
	
}
