public class SLList {

    public class IntNode {
        public int item;
        public IntNode next  ;        
    
        public IntNode(int i, IntNode n) {
            item = i;
            next = n;
        }
    }

    public IntNode first;

    public SLList(int x){
        first = new IntNode(x, null);
    }

    public static void main(String[] args){
        SLList L = new SLList(10);


        L.addLast(15);

        int size = L.size();
        System.out.println(size);

        int firstItem = L.getFirst();
        System.out.println(firstItem);


    }

    /** Adds x to the front of the list */
    public void addFirst(int x){
        first = new IntNode(x, first);
    }

    /** Adds x to the end of the list  */
    public void addLast(int x){
        IntNode ptr = first; 
        while(ptr.next != null){
            ptr = ptr.next; 
        }
        ptr.next = new IntNode(x, null);
    }

    /** Return the first item in the list */
    public int getFirst(){
        return this.first.item;
    }
    /** Return the size of the list by Iteration */
    public int iteratizeSize(){
        int counter = 0;
        IntNode ptr = first;
        while(ptr != null){
            counter++;
            ptr = ptr.next;
        }
        return counter;
    }
    private static int size(IntNode ptr){
        if(ptr.next == null){
            return 1;
        }
        return 1 + size(ptr.next);
    }
    public int size(){
        return size(first);
        
    }

}