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
	
	public String toString() {
		String str = "[";
		if (head == null) {
			str = "[]";
		} else str = str + head;
		Node i = head.next;
		while(i != null) {
			str = str + ", " + i;
			i = i.next;
		}
		return str + "]";
	}
	
	public Object removeFirst() {
		Node temp = head;
		head = head.next;
		Object returnData = temp.data;
		temp = null;
		size--;
		return returnData;
	}
	
	public Object remove(int index) {
		if(index == 0) {
			return removeFirst();
		}
		Node temp = node(index-1); //������ ���ؼ��� ����� ���� ���� index�� �������� �˾߾� ��.
		Node todoDeleted = temp.next; //������ ���� todoDeleted�� �����Ͽ�, returnData ���� 
		temp.next = temp.next.next; //���� ������ ������
		Object returnData = todoDeleted.data;
		if(todoDeleted == tail) { //��������ϴ� ��尡 tail�� ���
			tail = temp; //���� ���� tail�� �����Ѵ�. 
		}
		todoDeleted = null;
		size--;
		return returnData;
	}
	
	public Object returnLast() {
		return remove(size-1);
	}
	
	public int size() {
		return size;
	}
	
	public Object get(int index) { //�ش� ����� data�� ������ 
		Node temp = node(index); 
		return temp.data;
	}
	
	public int indexOf(Object data) {
		Node temp = head;
		int index = 0;
		while(temp.data != data && temp.next.data != null) {
			temp = temp.next;
			index++;
		}
		if(temp.data != data) {
			return -1;
		} else return index;
	
	}
	
	
	
	
	
	
	
	
	public Node getHead() {
		return head;
	}
	
	
	
	 

}
