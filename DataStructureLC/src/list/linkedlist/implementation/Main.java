package list.linkedlist.implementation;

public class Main {

	public static void main(String[] args) {
		LinkedList numbers = new LinkedList();
		
		
		numbers.addFirst(30);
		numbers.addFirst(20);
		numbers.addFirst(10);
		numbers.add(3, 15);
		numbers.add(4, 10000);
		System.out.println(numbers.node(3));
		System.out.println(numbers);

	}

}
