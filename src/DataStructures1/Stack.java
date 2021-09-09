package DataStructures1;

import java.util.Arrays;

public class Stack {
    private int[] items;
    private int size;
    Stack(int size)
    {
        items = new int[size];
        System.out.println(items.length);
    }
    public void push(int item)
    {
        if(size == items.length)
            throw new StackOverflowError();
        items[size++] = item;
    }
    public int pop()
    {
        if (size == 0)
            throw new IllegalArgumentException();

        return items[--size];
    }

    @Override
    public String toString()
    {
       var content = Arrays.copyOfRange(items,0,size);
       return Arrays.toString(content);
    }

    public int peek()
    {
        return items[size-1];
    }
}
