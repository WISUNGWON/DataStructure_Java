

import java.util.ArrayList;
import java.util.Iterator;



public class Iteratorex1 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<>();
		
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		
		//Iterator�� �̿��� �ݺ�
		Iterator it = numbers.iterator();
		
		while(it.hasNext()) {
			int value = (int) it.next();
			if(value == 30) {
				it.remove();
			}
			System.out.println(value);
			
		}
		System.out.println(numbers);
		
		
		//���� for���� �̿��� �ݺ� 
		for( int value : numbers) {
			System.out.println(value);
		}
		
		//�Ϲ����� for���� �̿��� �ݺ�
		for (int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
		
	}
	
	

}
