import org.junit.Test;
import static org.junit.Assert.*;

public class SLListVistaTest{

    @Test
    public void testSLListVistaTest(){
        SLListVista s = new SLListVista(1);
        s.addFirst(2);
        s.addFirst(3);
        int fir = s.indexOf(3);
        int sec = s.indexOf(2);
        int thi = s.indexOf(1);
        assertEquals(0, fir);
        assertEquals(1, sec);
        assertEquals(2, thi);

    }
}

public class SLList {
    ...
     public SLList() { ... }
    public void insertFront(int x) { ... }

     /* Returns the index of x in the list, if it exists.
        Otherwise, returns -1 */
     public int indexOf(int x) { ... }
}