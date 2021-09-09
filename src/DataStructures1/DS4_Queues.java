package DataStructures1;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class DS4_Queues {
    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<>();
        q1.add(10);
        q1.add(20);
        q1.add(30);
        q1.add(40);
        q1.add(50);

        DataStructures1.Queue q = new DataStructures1.Queue(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.dequeue();
        q.dequeue();
        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60);
        q.enqueue(10);
        System.out.println(q);

        QueueWithTwoStacks q2 = new QueueWithTwoStacks();
        q2.enqueue(10);
        q2.enqueue(20);
        System.out.println(q2);

        PriorityQueues pq = new PriorityQueues(5);
        pq.add(20);
        pq.add(22);
        pq.add(30);
        System.out.println(pq);

        q.kthReverse(q1,3);

    }

    private static void reverse(Queue<Integer> q) {
        Stack<Integer> s = new Stack<>();
        while(!q.isEmpty())
            s.push(q.remove());

        while(!s.empty())
            q.add(s.pop());
    }
}
