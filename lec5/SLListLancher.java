public class SLListLancher{
    public static void main(String[] args){

        SLList<String>  L = new SLList<>("hello");
        L.addFirst("you");
        System.out.println(L.getFirst());
    }
}