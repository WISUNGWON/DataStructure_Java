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
		
		System.out.println(numbers); //자바에서는 일반적으로 객체를 프린터하면, 객체가 위치한 곳(레퍼런스 값)을 출력한다.
		
	
	
		
	}

}
