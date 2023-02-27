import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(10);
        queue.add(10);
        queue.add(34);
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);
        System.out.println(reverseQueue(queue));
    }

    //reverse a queue
    public static Queue reverseQueue(Queue<Integer> q){
        Stack<Integer> stack = new Stack<>();
        while (!q.isEmpty()){
            stack.push(q.remove());
        }
        while (!stack.isEmpty()){
            q.add(stack.pop());
        }
        return q;
    }
}