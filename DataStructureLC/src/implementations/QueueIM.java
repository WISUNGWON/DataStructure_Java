package implementations;

import java.util.NoSuchElementException;

class Queue<T> {
    
    class Node<T> {
        private T data;
        private Node<T> next;
        
        public Node(T data) {
            this.data = data;
        }
    }
    
    private Node<T> first;
    private Node<T> last;
    
    public void add(T item) { // item 추가
        Node<T> t = new Node<T>(item); // 받은 item을 이용하여 노드 생성
        
        if (last != null) { // 마지막 노드가 있으면 그 뒤에 붙임.
            last.next = t; 
        }
        last = t;
        if (first == null ) { // 데이터가 없을 경우 추가 노드가 첫 노드가됨.
            first = last;
        }
    }
    
    public T remove() {
        if (first == null) { // 큐가 비어있는데 remove를 할경우 에러 처리
            throw new NoSuchElementException();
        }
        
        T data = first.data; // 제거한 data를 반환하기 위해 백업
        first = first.next;
        
        if (first == null) { // first가 null이면 last도 null 처리 잊지말기
            last = null;
        }
        return data;
    }
    
    public T peek() { // 첫 번째 값을 반환한다.
        if (first == null) {
            throw new NoSuchElementException();
        }
        return first.data;
    }
    
    public boolean isEmpty() {
        return first == null;
    }
}
public class QueueIM {

    public static void main(String[] args) {
        Queue<Integer> q = new Queue<Integer>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.peek());
        System.out.println(q.remove());
        System.out.println(q.isEmpty());
        System.out.println(q.remove());
        System.out.println(q.isEmpty());
    }

}
