package list.linkedlist.implementation;

public class Main {

	public static void main(String[] args) {
		LinkedList numbers = new LinkedList();
		numbers.addFirst(50);
		numbers.addFirst(50);
		numbers.addFirst(50);
		numbers.addFirst(50);
		numbers.add(1, 15);
		numbers.removeFirst();
		numbers.remove(3);
		System.out.println(numbers);
	}
}
