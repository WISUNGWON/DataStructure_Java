package practice.coding;

public class Main {
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
	
		al.addLast(10);
		al.addLast(20);
		al.addLast(30);
		al.addLast(40);
		al.add(1, 15);
		al.addFirst(15);
		
		System.out.println(al); //자바에서는 일반적으로 객체를 프린터하면, 객체가 위치한 곳(레퍼런스 값)을 출력한다.
		
	
	}

}
