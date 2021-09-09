package DataStructures1;

import java.util.NoSuchElementException;

public class LinkedList {

    public class Node {
        int value;
        Node next;
        Node(int value)
        {
            this.value = value;
            next = null;
        }
    }
    private Node first;
    private Node last;
    private int size;

    void addFirst(int k)
    {
        Node temp = new Node(k);
        if(isEmpty())
        {
            first=last= temp;
        }
        else
        {
            temp.next = first;
            first = temp;
        }
        size++;
    }
    void addLast(int k)
    {
        Node temp = new Node(k);
        if(isEmpty())
            first = last = temp;
        else {
            last.next = temp;
            last = temp;
        }
        size++;
    }
    void print()
    {
        Node temp = first;
        while(temp!=null)
        {
            System.out.println(temp.value);
            temp=temp.next;
        }
    }
    private boolean isEmpty()
    {
        return first==null;
    }

    public int indexOf(int item)
    {
        int index = 0;
        var current = first;
        while(current!=null)
        {
            if(current.value==item) return index;
            current = current.next;
            index++;
        }
        return -1;
    }
    void removeFirst()
    {
        if(isEmpty())
            throw new NoSuchElementException();

        if(first==last)
        {
            first = last = null;
        }
        else
        {
            Node temp = first;
            first = first.next;
            temp.next = null;
        }
        size--;

    }

    void removeLast()
    {
        if(isEmpty())
            throw new NoSuchElementException();

        if(first == last)
        {
            first = last = null;
        }
        else
        {
            var current = first;
            while(current!=null)
            {
                if(current.next == last)
                {
                    last = current;
                    last.next=null;
                    break;
                }
                current=current.next;
            }
        }
        size--;
    }

    public int size()
    {
        return size;
    }
    public void reverse()
    {
        if(isEmpty())
            throw new NoSuchElementException();

        if(first == last)
        {
            return;
        }
        Node prev=null,current,next;
        current = first;
        while(current!=null)
        {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        first = prev;
    }

    public void fromEnd(int k)
    {
        Node p = first;
        Node q = first;
        for(int i=0;i<k-1;i++)
        {
            q = q.next;
            if(q==null)
                throw new IllegalArgumentException();
        }
        while(q.next!=null)
        {
            q = q.next;
            p = p.next;
        }
        System.out.println(p.value);
    }

    public void middle()
    {
        Node p = first;
        Node q = first;
        while(q!=last && q.next!=last)
        {
            q = q.next.next;
            p = p.next;
        }

        if(q == last)
            System.out.println(p.value);
        else
            System.out.println(p.value+" , "+p.next.value);
    }
}
