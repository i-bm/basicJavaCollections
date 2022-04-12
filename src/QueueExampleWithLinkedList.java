import java.util.LinkedList;
import java.util.Queue;

public class QueueExampleWithLinkedList {
    public static void main(String[] args)
    {
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < 5; i++)
            queue.add(i);

        System.out.println("Elements of queue " + queue);

        int removedele = queue.remove();
        System.out.println("removed element: " + removedele);

        System.out.println(queue);

        int head = queue.peek();
        System.out.println("head of queue: " + head);

        int size = queue.size();
        System.out.println("Size of queue: "+ size);
    }
}
