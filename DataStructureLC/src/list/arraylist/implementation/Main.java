package list.arraylist.implementation;
import java.util.Iterator;


public class Main {
	
	public static void main(String[] args) {
		
		ArrayList numbers = new ArrayList();
		//ArrayList.java������ Ŭ������ �ν��Ͻ�ȭ ��  -> ����Ϸ���!
		numbers.addLast(10);
		numbers.addLast(20);
		numbers.addLast(30);
		numbers.addLast(40);
		numbers.add(1, 15);
		numbers.addFirst(15);
		
		System.out.println(numbers);
		System.out.println(numbers.size());
		numbers.remove(1);
		
		System.out.println(numbers); //�ڹٿ����� �Ϲ������� ��ü�� �������ϸ�, ��ü�� ��ġ�� ��(���۷��� ��)�� ����Ѵ�.
		System.out.println(numbers.size());
		System.out.println(numbers.get(1));
		System.out.println(numbers.indexOf(20));
		System.out.println(numbers.indexOf(60));
		
		
		ArrayList.ListIterator li = numbers.listIterator();
		
		System.out.println("this is numbers " + numbers);
		
		while (li.hasNext()) {
			int number = (int)li.next();
			if(number == 30) {
				li.add(35);
			}
		}
		
		System.out.println("this is numbers " + numbers);
		
		
		while (li.hasPrevious()) {
			System.out.println(li.previous());
		}
		
		while (li.hasNext()) {
			int number = (int)li.next();
			if(number == 30) {
				li.remove();
			}
		}
		
		System.out.println("this is numbers " + numbers);
		
	}

}
