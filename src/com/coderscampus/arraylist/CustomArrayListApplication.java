package com.coderscampus.arraylist;

public class CustomArrayListApplication {
	public static void main(String[] args) {
		numbersTest();
		//stringTest();
		
	}

	private static void stringTest() {
		CustomList<String> strings = new CustomArrayList<>();
		strings.add("ONE");
		strings.add("TWO");
		strings.add("THREE");
		strings.add("FOUR");
		strings.add("FIVE");
		strings.add("SIX");
		strings.add("SEVEN");
		strings.add("EIGHT");
		strings.add("NINE");
		strings.add("TEN");
		strings.add("ELEVEN");
		strings.add("TWELVE");
		strings.add("THIRTEEN");
		strings.getSize();
		strings.get(10);
		
		// then you should validate that all the elements you've inserted actually exist in your data structure
		for (int i=0; i<strings.getSize(); i++) {
		    System.out.println(strings.get(i));
		}
	}

	private static void numbersTest() {
		CustomList<Integer> numbers = new CustomArrayList<>();
		
		for(int i=0; i<=149; i++) {
			numbers.add(i);
		}
		
		// then you should validate that all the elements you've inserted actually exist in your data structure
		for (int i=0; i<numbers.getSize(); i++) {
		    System.out.println(numbers.get(i));
		}
	}
}
