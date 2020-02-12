package arrayList;

import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<>();
		
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		System.out.println("add(°ª)");
		System.out.println(numbers);
		
		numbers.add(1, 50);
		System.out.println("\nadd(ÀÎµ¦½º, °ª)");
		System.out.println(numbers);
		
		numbers.remove(2);
		System.out.println("\nremove(ÀÎµ¦½º)");
		System.out.println(numbers);
		
		System.out.println("\nget(ÀÎµ¦½º)");
		System.out.println(numbers.get(2));
		
		System.out.println("\nsize()");
		System.out.println(numbers.size());
		
		
	}

}
