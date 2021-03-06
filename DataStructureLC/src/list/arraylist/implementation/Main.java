package list.arraylist.implementation;
import java.util.Iterator;


public class Main {
	
	public static void main(String[] args) {
		
		ArrayList numbers = new ArrayList();
		//ArrayList.java파일의 클래스를 인스턴스화 함  -> 사용하려고!
		numbers.addLast(10);
		numbers.addLast(20);
		numbers.addLast(30);
		numbers.addLast(40);
		numbers.add(1, 15);
		numbers.addFirst(15);
		
		System.out.println(numbers);
		System.out.println(numbers.size());
		numbers.remove(1);
		
		System.out.println(numbers); //자바에서는 일반적으로 객체를 프린터하면, 객체가 위치한 곳(레퍼런스 값)을 출력한다.
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
