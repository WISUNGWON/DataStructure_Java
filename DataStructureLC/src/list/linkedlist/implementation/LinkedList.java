package list.linkedlist.implementation;

public class LinkedList {
	private Node head;
	private Node tail;
	private int size = 0;

	private class Node {
		private Object data;
		private Node next;

		public Node(Object input) {
			this.data = input;
			this.next = null;
		}

		public String toString() {
			return String.valueOf(this.data);
		}
	} // end of Node
	
	public void addFirst(Object input) {
		Node newNode = new Node(input);
		newNode.next = head;	
		head = newNode;
		size++;
		if (head.next == null) {
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
	
	Node node(int index) {
		Node n = head;
		for (int i = 0; i < index; i++) {
			n = n.next;
		}
		return n;
	}
	
	public void add(int index, Object input) {
		if (index == 0) {
			addFirst(input); 
		} else {
			Node previousNode = node(index - 1);
			Node newNode = new Node(input);
			Node nextNode = previousNode.next;
			previousNode.next = newNode;
			newNode.next = nextNode;
			size++;
			if (newNode.next == null) {
				tail = newNode;
			}
		}
	}
	
	public String toString() {
		if (head == null) {
			return "[]";
		} 
		Node temp = head;
		String str = "[";
		while (temp.next != null) {
			str += temp.data + ", ";
			temp = temp.next;
		}
		str += temp.data;
		
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
		if (index == 0) {
			return removeFirst();
		}
		Node previousNode = node(index - 1);
		Node todoDeleted = previousNode.next;
		previousNode.next = previousNode.next.next;
		Object returnData = todoDeleted.data;
		if (todoDeleted == tail) {
			tail = previousNode;
		}
		todoDeleted = null;
		size--;
		return returnData;
	}

	public int getSize() {
		return size;
	}
	
	public Object get(int index) {
		return node(index).data;
	}
	
} // end of class
