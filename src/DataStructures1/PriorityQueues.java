package DataStructures1;

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
        int i;
        for(i=count;i>=0;i--)
        {
            if(items[i]>item)
                items[i+1] = items[i];
            else
                break;
        }
        items[i+1] = item;
        count++;
    }

}
