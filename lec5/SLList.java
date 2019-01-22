public class SLList<Lochness> {

    public class StuffNode {
        public Lochness item;
        public StuffNode next  ;        
    
        public StuffNode(Lochness i, StuffNode n) {
            item = i;
            next = n;
        }
    }

    public StuffNode first;
    private int size;

    public SLList(Lochness x){
        first = new StuffNode(x, null);
        size = 1;
    }


    /** Adds x to the front of the list */
    public void addFirst(Lochness x){
        first = new StuffNode(x, first);
        size += 1;
    }

    /** Adds x to the end of the list  */
    public void addLast(Lochness x){
        size += 1;

        StuffNode ptr = first; 
        while(ptr.next != null){
            ptr = ptr.next; 
        }
        ptr.next = new StuffNode(x, null);
        
    }

    /** Original addLast method */

    /** Return the first item in the list */
    public Lochness getFirst(){
        return first.item;
    }
    /** Return the size of the list by Iteration */
    public int iteratizeSize(){
        int counter = 0;
        StuffNode ptr = first;
        while(ptr != null){
            counter++;
            ptr = ptr.next;
        }
        return counter;
    }
    // private static int size(StuffNode ptr){
    //     if(ptr.next == null){
    //         return 1;
    //     }
    //     return 1 + size(ptr.next);
    // }
    // public int size(){
    //     return size(first);
        
    // }
    public int size(){
        return size;
    }

}