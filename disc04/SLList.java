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

    public SLList(){
        first = null;
    }

    /** Adds x to the front of the list */
    public void addFirst(int x){
        first = new IntNode(x, first);
    }

    /** Insert an item into the SLlist */
    public void insert(int item, int position){
        IntNode ptr = first;
        // if the first is null
        if (ptr == null || position == 0) {
            addFirst(item);
            return;
        }
        while (position > 1 && ptr.next != null) {
            ptr = ptr.next;
            position--;
        }
        ptr.next = new IntNode(item, ptr.next);
    }

    public void reverse(){
        // bring the Intnode 1 to n and 'first' point to the 2 of the IntList;
        // bring the Intnode 2 to n - 1 and 'first' point to the 3 of the IntList;
        // (1 -> 2 -> 3 -> 4 -> null)
        // (4 -> 3 -> 2 -> 1 -> null)

        /** iterate first to end of the IntList */
        int size = size();
        int counter = 0;
        while (counter < size - 1) {
            insert(first.item, size  - counter);
            counter++;
            first = first.next;
        }
    }

    public void AnotherIterativeReverse(){
        if(first == null || first.next == null){
            return;
        }
        IntNode ptr = first.next;
        first.next = null;
        while(ptr != null){
            IntNode temp = ptr.next;
            ptr.next = first;
            first = ptr;
            ptr = temp;
        }
    }

    public void reverseRecursive(){
        first = reverseRecursive(first);
    }

    private IntNode reverseRecursive(IntNode lst){
        if(lst == null || lst.next == null){
            return lst;
        }
        IntNode endOfReversed = lst.next;
        IntNode reversed = reverseRecursive(lst.next);
        endOfReversed.next = lst;
        lst.next = null;
        return reversed;

    }


    public int size(){
        return size(first);
    }

    private int size(IntNode first){
        if(first == null){
            return 0;
        }
        return 1 + size(first.next);
    }

    public int get(int n){
        return get(n, first);
    }

    private int get(int n, IntNode first){
        if(n == 0){
            return first.item;
        }
        return get(n - 1, first.next);
    }

    public static void main(String[] args){
        SLList L = new SLList(10);
        L.addFirst(9);
        System.out.println(L.get(1));
        L.insert(8,0);
        System.out.println(L.get(0));


    }

}