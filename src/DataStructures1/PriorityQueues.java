package DataStructures1;

import java.util.Arrays;

public class PriorityQueues {
    private int items[];
    private int count;

    PriorityQueues(int size)
    {
        items = new int[size];
    }

    public void add(int item)
    {
        if(count== items.length)
            throw new IllegalStateException();

        var i = shiftItems(item);

        items[i] = item;
        count++;
    }

    public int shiftItems(int item)
    {
        int i;
        for(i=count-1;i>=0;i--)
        {
            if(items[i]>item)
                items[i+1] = items[i];
            else
                break;
        }
        return i+1;
    }

    public int remove()
    {
        if(count==-1)
            throw new IllegalStateException();
        return items[--count];
    }

    @Override
    public String toString()
    {
        return Arrays.toString(items);
    }


}
