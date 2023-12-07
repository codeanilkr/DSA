import java.util.Stack;

public class PushStackBottom {
    public static void PushAtBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }

        int temp = s.pop();
        PushAtBottom(s, data);
        s.push(temp);
    }

    public static void main(String[] args) {
        Stack<Integer> sta = new Stack<>();
        sta.push(1);
        sta.push(2);
        sta.push(3);
        sta.push(4);
        sta.push(5);

        // Pushing 6 to the bottom of the stack
        PushAtBottom(sta, 6);

        // Pop and print the elements
        while (!sta.isEmpty()) {
            System.out.println(sta.peek());
            sta.pop();
        }
    }
}
