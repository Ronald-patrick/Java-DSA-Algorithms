package DataStructures1;

import java.util.Arrays;
import java.util.Stack;

public class QueueWithTwoStacks {
    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();

    public void enqueue(int item)
    {
        stack1.push(item);
    }
    public int dequeue(){
        if(stack1.empty())
        {
            throw new IllegalStateException();
        }
        if(stack2.empty())
        {
            while(!stack1.empty())
                stack2.push(stack1.pop());
        }
        return stack2.pop();
    }
    @Override
    public String toString()
    {
        return stack1.toString();
    }


}
