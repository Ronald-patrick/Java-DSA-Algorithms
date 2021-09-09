package DataStructures1;

public class Array {
    int a[];
    int size;
    int curr;
    Array(int size)
    {
        a = new int[size];
        this.size = size;
        curr=0;
    }
    void insert(int num)
    {
        if(curr<size)
        {
            a[curr] = num;
        }
        else
        {
            size = size*2;
            int[] k= new int[size];
            for(int i=0;i<a.length;i++)
            {
                k[i] = a[i];
            }
            k[curr] = num;
            a = k;
        }
        curr++;
    }
    void print()
    {
        for(int i=0;i<curr;i++)
        {
            System.out.print(a[i] + " ");
        }
    }
    void removeAt(int pos)
    {
        if(pos<0 || pos>=curr)
            throw new IllegalArgumentException();
        for(int i=pos;i<curr;i++)
        {
            a[i] = a[i+1];
        }
        curr--;
    }

    public int indexOf(int item)
    {
        //Complexity
        // O(1) best case
        // O(n) worst case
        for(int i=0;i<curr;i++)
        {
            if(a[i]==item)
            return i;
        }
        return -1;
    }
}
