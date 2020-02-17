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
			return String.valueOf(this.data); //�� ��� 1���� ���� ���
		}
	}
	
	public void addFirst(Object input) {
		Node newNode = new Node(input);
		newNode.next = head; //�� ���� �������� �����ϰ� �ִ�!
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
	
	public Node node(int index) { // ���������� ���� API ���� (���������� ���� �޼��带 public���� �����ϴ� ���� �ٶ������� ����, �� test�� ���� public���)
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
			Node newNode = new Node(input); //temp2�� ���� �����ϴ� ��ĵ� ������, �׷����ϸ� �ڵ尡 1�� �����.
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
