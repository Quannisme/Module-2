package ss11.java.TH;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class vd {
    public static void main(String[] args) {
        Stack<Integer>stack=new Stack<>();
        Queue<Integer>queue=new LinkedList<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop());
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        System.out.println(queue.poll());
    }
}
