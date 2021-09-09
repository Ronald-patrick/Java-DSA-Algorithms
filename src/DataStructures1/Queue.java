package DataStructures1;
import java.util.Arrays;

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

    @Override
    public String toString()
    {
        return Arrays.toString(items);
    }

}
