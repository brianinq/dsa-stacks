import java.util.*;

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
        var arr = new int[3];
        arr[0] = 99;
        arr[1] = 3;
        arr[2] = 945;
        System.out.println(Arrays.toString(sortArrayUsingPriorityQue(arr)));
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
    public static int[] sortArrayUsingPriorityQue(int[] nums){
        int[] arr = new int[nums.length];
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (var num: nums){
            pq.add(num);
        }
        int i = 0;
        while (!pq.isEmpty()){
            arr[i] = pq.remove();
            i++;
        }
        return arr;
    }
}