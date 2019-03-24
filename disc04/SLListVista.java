import java.util.NoSuchElementException;

public class SLListVista extends SLList {


    public SLListVista(int x) {
        super(x);
    }
    public int indexOf(int x) {
        return indexOf(first, x);
    }

    private int indexOf(IntNode first, int x) {
        if (first.item == x) {
            return 0;
        } else if (first.next == null) {
            throw new NoSuchElementException();
        }
        return 1 + indexOf(first.next, x);
    }
}

public class SLListVista extends SLList {
    @Override
    public int indexOf(int x) {
         int index = super.indexOf(x);
         if (index == -1) {
             throw new NoSuchElementException();
             }
         return index;
     }
}

public class DMSList {
2 private IntNode sentinel;
3 public DMSList() {
        4 sentinel = new IntNode(-1000, _____________________);
        5 }
6 public class IntNode {
7 public int item;
8 public IntNode next;
9 public IntNode(int i, IntNode h) {
            10 item = i;
            11 next = h;
            12 }
13 public int max() {
            14 return Math.max(item, next.max());
            15 }
16 }
17 public class ____________________________{
18 ____________________________________________________________
19 ____________________________________________________________
20 ____________________________________________________________
21 ____________________________________________________________
22 ____________________________________________________________
23 ____________________________________________________________
24 ____________________________________________________________
25 ____________________________________________________________
26 }
27 public int max() {
        28 return sentinel.next.max();
        29 }
30 }