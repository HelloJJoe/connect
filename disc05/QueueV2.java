import java.util.Stack;


public class QueueV2<E> {
    private Stack<E> stack;
    private Stack<E> buffer;

    public QueueV2() {
        stack = new Stack<>();
        buffer = new Stack<>();
    }

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
        QueueV2<Integer> queue = new QueueV2<>();
        queue.push(3);

        queue.push(1);
        queue.push(2);
        queue.push(3);

        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

    }
}