import java.util.Stack;

public class SortedStack<item extends Comparable<item>> {
    private Stack<item> stack;
    private Stack<item> buffer;

    public SortedStack() {
        stack = new Stack<>();
        buffer = new Stack<>();
    }

    public void push(item i) {
        /**
         * METHOD 1
         * insert Interger i into stack 
         * 1. new element has to compare the elements in stack
         * 2. if greater than new element, push into buffer
         * 3. else, the element push back, and the new element push into stack
         * 4. elements in buffer push back into stack. 
         * 
         * METHOD 2 
         * 1. use priority queue
         * */ 
        while (!stack.isEmpty() && stack.peek().compareTo(i) < 0) {
            buffer.push(stack.pop());
        }
        stack.push(i);
        while (!buffer.isEmpty()) {
            stack.push(buffer.pop());
        }
    }


    public item pop() {
        return stack.pop();
    }

    public static void main (String[] args) {
        SortedStack<Integer> ss = new SortedStack<>();
        ss.push(10);
        ss.push(4);
        ss.push(8);
        ss.push(2);
        ss.push(14);
        ss.push(3);
        System.out.println(ss.pop());
        System.out.println(ss.pop());
        System.out.println(ss.pop());
        System.out.println(ss.pop());
        System.out.println(ss.pop());
        System.out.println(ss.pop());




    }
}