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
		
		System.out.println(numbers); //�ڹٿ����� �Ϲ������� ��ü�� �������ϸ�, ��ü�� ��ġ�� ��(���۷��� ��)�� ����Ѵ�.
		
	
	
		
	}

}
