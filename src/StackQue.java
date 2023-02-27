import java.util.Arrays;
import java.util.Stack;

public class StackQue {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;


    private void enqueue(int item){
        stack1.push(item);
    }
    private int dequeue(){
        if (stack2.isEmpty() && stack1.isEmpty()){
            throw new IllegalStateException();
        }
        if (stack2.isEmpty()){
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
    @Override
    public String toString(){
        return stack2.toString();
    }
}
