import java.util.LinkedList;
import java.util.Queue;

public class QueueCollection {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>(); // Corrected instantiation
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(7);
        q.add(8);

        while (!q.isEmpty()) { // Corrected isEmpty check
            System.out.println(q.peek());
            q.remove();
        }
    }
}
