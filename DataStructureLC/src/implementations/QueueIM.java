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
    
    public void add(T item) { // item �߰�
        Node<T> t = new Node<T>(item); // ���� item�� �̿��Ͽ� ��� ����
        
        if (last != null) { // ������ ��尡 ������ �� �ڿ� ����.
            last.next = t; 
        }
        last = t;
        if (first == null ) { // �����Ͱ� ���� ��� �߰� ��尡 ù ��尡��.
            first = last;
        }
    }
    
    public T remove() {
        if (first == null) { // ť�� ����ִµ� remove�� �Ұ�� ���� ó��
            throw new NoSuchElementException();
        }
        
        T data = first.data; // ������ data�� ��ȯ�ϱ� ���� ���
        first = first.next;
        
        if (first == null) { // first�� null�̸� last�� null ó�� ��������
            last = null;
        }
        return data;
    }
    
    public T peek() { // ù ��° ���� ��ȯ�Ѵ�.
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
