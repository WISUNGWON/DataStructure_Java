package list.practice.fastcampus;

import java.util.ArrayList;

class MyStack {
	
	private ArrayList<String> arrayStack = new ArrayList<String>();
	
	public void push(String data) {
		arrayStack.add(data);
	}
	
	public String pop() {
		int len = arrayStack.size();
		if (len == 0) {
			System.out.println("Stack is Empty");
			return null;
		}
		return arrayStack.remove(len-1);
	}
	
	
}
public class StackTest {
	
	public static void main(String[] args) {
		MyStack stack = new MyStack();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		System.out.println();
		System.out.println(stack.pop());
		
	}
}
	
	