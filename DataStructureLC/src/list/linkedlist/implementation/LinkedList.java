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
		Node temp = node(index-1); //삭제를 위해서는 지우고 싶은 값의 index의 이전값을 알야야 함.
		Node todoDeleted = temp.next; //삭제할 값을 todoDeleted에 저장하여, returnData 유지 
		temp.next = temp.next.next; //값의 연결이 끊어짐
		Object returnData = todoDeleted.data;
		if(todoDeleted == tail) { //지우고자하는 노드가 tail일 경우
			tail = temp; //이전 값을 tail로 설정한다. 
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
	
	public Object get(int index) { //해당 노드의 data를 가져옴 
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
