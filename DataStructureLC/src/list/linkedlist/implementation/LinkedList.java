package list.linkedlist.implementation;

public class LinkedList {
	private Node head; 
	private Node tail; 
	private int size = 0;
	
	private class Node{ 
		private Object data; 
		private Node next; 
		public Node(Object input){ 
			this.data = input; 
			this.next = null; 
		}
		public String toString() {
			return String.valueOf(this.data); //각 노드 1개의 값만 출력
		}
	}
	
	public void addFirst(Object input) {
		Node newNode = new Node(input);
		newNode.next = head; //각 노드는 다음값을 저장하고 있다!
		head = newNode;
		size++;
		if (head.next == null ) {
			tail = head;
		}
	}
	
	public void addLast(Object input) {
		Node newNode = new Node(input);
		if (size == 0) {
			addFirst(input);
		} else {
			tail.next = newNode;
			tail = newNode;
			size++;
		}
	}
	
	public Node node(int index) { // 내부적으로 사용될 API 생성 (내부적으로 사용될 메서드를 public으로 선언하는 것은 바람직하지 않음, 단 test를 위해 public사용)
		Node x = head;
		for(int i = 0; i < index; i++) {
			x = x.next;
		}
		return x;
	} 
	
	public void add(int index, Object input) {
		if (index == 0) {
			addFirst(input);
		} else {
			Node newNode = new Node(input); //temp2를 만들어서 지정하는 방식도 있지만, 그렇게하면 코드가 1줄 길어짐.
			Node temp1 = node(index-1);
			newNode.next = temp1.next;
			temp1.next = newNode;
			if (newNode.next == null) {
				tail = newNode;
			}
			size++;
		}
		
	}
	
	public Node getHead() {
		return head;
	}
	
	 

}
