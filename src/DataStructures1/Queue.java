package DataStructures1;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

public class Queue {
    private int front ;
    private int rear ;
    private int count = -1;
    private int items[];

    Queue(int size)
    {
        items = new int[size];
    }

    public void enqueue(int item)
    {
        if(count == items.length)
            throw new IllegalStateException();
         items[rear] = item;
         rear = (rear+1) % items.length;
         count++;
    }

    public int dequeue()
    {
        if(count==0)
            throw new IllegalStateException();
        var item = items[front];
        items[front] = 0;
        front = (front + 1) % items.length;
        count--;
        return item;
    }

    public void kthReverse(java.util.Queue<Integer> qs, int k)
    {
        System.out.println(qs);
        Stack<Integer> s = new Stack<>();
        int t = k;
        while(t>0)
        {
            s.push(qs.peek());
            qs.remove();
            t--;
        }
        while(!s.empty())
        {
            qs.add(s.peek());
            s.pop();
        }

        for(int i =0;i<qs.size()-k;i++)
        {
            qs.add(qs.peek());
            qs.remove();
        }

        System.out.println(qs);
    }

    @Override
    public String toString()
    {
        return Arrays.toString(items);
    }

}
