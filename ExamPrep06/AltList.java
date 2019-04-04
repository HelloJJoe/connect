public class AltList<X, Y> {

    private X item;
    private AltList<Y, X> next;

    AltList(X item, AltList<Y, X> next) {
        this.item = item;
        this.next = next;
    }

    public void printOdd() {
        AltList<X, Y> ptr = this;
        while (ptr != null) {
            System.out.println(ptr.item);
            ptr = ptr.next.next;
        }
    }

    public void printEven() {
        AltList<Y, X> ptr = next;
        while (ptr.next != null) {
            System.out.println(ptr.item);
            ptr = ptr.next.next;
        }
        System.out.println(ptr.item);
    }

    public AltList<Y, X> pairsSwapped() {
        AltList<Y, X> newList = new AltList<Y, X>(next.item,
                new AltList<X, Y>(item, null));
        if (next.next != null) {
            newList.next.next = next.next.pairsSwapped();
        }
        return newList;
    }

    public static void main(String[] args) {

       AltList<Integer, String> list = new AltList<Integer, String>(5,
               new AltList<String, Integer>("cat",
                       new AltList<Integer, String>(10,
                               new AltList<String, Integer>("dog", null))));
       AltList<String, Integer> newList = list.pairsSwapped();

//       list.printOdd();
//       list.printEven();

       newList.printOdd();
       newList.printEven();



    }
}