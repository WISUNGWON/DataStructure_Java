package list.practice.fastcampus;

import java.util.LinkedList;
import java.util.Queue;

public class QueueClass {

    public static void main(String[] args) {
        
        Queue<String> q1 = new LinkedList<String>();
        q1.offer("강감찬");  // 순차 보관
        q1.offer("이순신"); 
        q1.offer("진갑용"); 
        q1.offer("이을룡"); 
        System.out.println(q1.peek()); //가장 먼저 보관한 값 단순 참조
        
        while(!q1.isEmpty()) { //비었는지 판별
            System.out.println(q1.poll()); //가장 먼저 보관한 값 꺼내고 반환
        }
        
        
        

    }

}
