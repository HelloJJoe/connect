
import java.util.Stack;


public class Queue<E> {

    private Stack<E> stack = new Stack<E>();

    public void push(E element) {
        stack.push(element);
    }

    public E poll() {
        return poll(stack.pop());
    }

    private E poll(E previous) {
        if (stack.isEmpty()) {
            return previous;
        }
        E current = stack.pop();
        E toReturn = poll(current);
        push(previous);        
        return toReturn;
    }

    // public E poll() {

    //     Stack<E> temp = new Stack<>();
    //     while(!stack.isEmpty()) {
    //         temp.push(stack.pop());
    //     }

    //     E toReturn = temp.pop();
    //     while(!temp.isEmpty()){ 
    //         stack.push(temp.pop());
    //     }
    //     return toReturn;
    
    // }

    public static void main(String[] args) {

        Queue<Integer> queue = new Queue<>();
        queue.push(1);
        queue.push(2);
        
        System.out.println(queue.poll());
        System.out.println(queue.poll());

    }


}