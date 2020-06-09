package list.practice.fastcampus;

import java.util.Stack;

public class StackClass {

    public static void main(String[] args) {
        
        Stack<String> stack = new Stack<>();
        
        stack.push("A");
        stack.push("B");
        stack.push("C");
        System.out.println(stack.pop());
        
        while(!stack.empty()) {
            System.out.println(stack.pop());
        }
        
        Stack<Integer> s2 = new Stack<>();
        
        for (int i = 0; i < 5; i++) {
            s2.push(i + 1);
            System.out.println(s2.peek());
        }
        System.out.println(s2.pop());
        System.out.println(s2.peek());
        System.out.println((s2.search(1)));

    }

}
