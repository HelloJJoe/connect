public class AltList<X, Y> {
    private X item;
    private AltList<Y, X> next;

    AltList(X item, AltList<Y, X> next) {
        this.item = item;
        this.next = next;
    }   

    public static void main (String[] args) {

        AltList<Integer, String> list = new AltList<Integer,String>(5, new AltList<String, Integer>("cat", new AltList<Interger, String>(10, new AltList<String, Integer>("dog", null))));
    }
}