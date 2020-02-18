package list.practice.fastcampus;

import java.util.ArrayList;

class MyQueue {
	
	private ArrayList<String> arrayQueue = new ArrayList<String>();
	
	public String dequeue() {
		int len = arrayQueue.size();
		if (len == 0) {
			System.out.println("큐에 처리할 data가 없습니다.");
			return null;
		}
		return arrayQueue.remove(0);
	}
	
	public void inqueue (String data) {
			arrayQueue.add(data);
		}
}
	

public class QueueTest {
	
	public static void main(String[] args) {
		
		MyQueue queue = new MyQueue();
		queue.inqueue("A");
		queue.inqueue("B");
		queue.inqueue("C");
		queue.inqueue("D");
		
		System.out.println(queue.dequeue());
	}

}
