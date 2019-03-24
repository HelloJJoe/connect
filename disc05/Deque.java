import java.util.Stack;


public class Deque<E> {
    private Stack<E> stack = new Stack<>();
    private Stack<E> buffer = new Stack<>();

    public void push(E element) {
        while (!stack.isEmpty()) {
            buffer.push(stack.pop());
        }
        stack.push(element);
        while (!buffer.isEmpty()) {
            stack.push(buffer.pop());
        }
    }

    public E poll() {
       return stack.pop();
    }

    public static void main (String[] args) {
        Deque<Integer> queue = new Deque<>();
        queue.push(1);
        queue.push(2);
        queue.push(3);

        int n = queue.poll();
        System.out.println(n);
    }
}