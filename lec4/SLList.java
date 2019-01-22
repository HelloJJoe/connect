public class SLList {

    public class IntNode {
        public int item;
        public IntNode next  ;        
    
        public IntNode(int i, IntNode n) {
            item = i;
            next = n;
        }
    }

    public IntNode sentinel;
    private int size;

    public SLList(int x){
        sentinel = new IntNode(64, null);
        sentinel.next = new IntNode(x, null);
        size = 1;
    }

    public SLList(){
        sentinel = new IntNode(64, null);
        size = 0;
    }

    /** Adds x to the front of the list */
    public void addFirst(int x){
        sentinel.next = new IntNode(x, sentinel.next);
        size += 1;
    }

    /** Adds x to the end of the list  */
    public void addLast(int x){
        size += 1;

        IntNode ptr = sentinel; 
        while(ptr.next != null){
            ptr = ptr.next; 
        }
        ptr.next = new IntNode(x, null);
        
    }

    /** Original addLast method */

    /** Return the first item in the list */
    public int getFirst(){
        return this.sentinel.next.item;
    }
    /** Return the size of the list by Iteration */
    public int iteratizeSize(){
        int counter = 0;
        IntNode ptr = sentinel;
        while(ptr != null){
            counter++;
            ptr = ptr.next;
        }
        return counter;
    }
    // private static int size(IntNode ptr){
    //     if(ptr.next == null){
    //         return 1;
    //     }
    //     return 1 + size(ptr.next);
    // }
    // public int size(){
    //     return size(first);
        
    // }
    private int size(){
        return size;
    }

    public static void main(String[] args){
        SLList L = new SLList();

        System.out.println(L.size());

        L.addLast(10);
        System.out.println(L.size());

    }

}