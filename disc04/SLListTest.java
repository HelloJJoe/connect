import org.junit.Test;
import static org.junit.Assert.*;

public class SLListTest{

    @Test
    public void testInsert1(){
        SLList L = new SLList();
        L.insert(1, 0);
        assertEquals(1, L.get(0));

    }

    @Test
    public void testInsert2(){
        SLList L = new SLList(1);
        L.insert(2, 0);
        L.insert(3, 2);

        // 2 - > 1 -> 3
        assertEquals(2, L.get(0));
        assertEquals(3, L.get(2));
    }

    @Test
    public void testInsert3(){
        SLList L = new SLList(1);
        L.insert(2, 1);
        assertEquals(2, L.get(1));
    }

    @Test
    public void testSize(){
        SLList L = new SLList(1);
        L.addFirst(2);
        L.addFirst(3);
        assertEquals(3, L.size());
    }

    @Test
    public void testSize2(){
        SLList L = new SLList();
        assertEquals(0, L.size());
    }

    @Test
    public void testSize3(){
        SLList L = new SLList(1);

        assertEquals(1, L.size());
    }

    @Test
    public void testSize4(){
        SLList L = new SLList(1);
        L.insert(2,0);
        assertEquals(2, L.size());
    }

    @Test
    public void testReverse(){
        SLList L = new SLList(3);
        L.addFirst(2);
        L.addFirst(1);
        L.reverse();
        assertEquals(3, L.get(0));
    }

    @Test
    public void testReverse1(){
        SLList L = new SLList(5);
        L.addFirst(4);
        L.addFirst(3);
        L.addFirst(2);
        L.addFirst(1);
        assertEquals(1, L.get(0));
        assertEquals(2, L.get(1));


        L.reverse();
        assertEquals(5, L.get(0));
        assertEquals(4, L.get(1));
        assertEquals(3, L.get(2));


    }
    @Test
    public void testAnotherIterativeReverse(){
        SLList L = new SLList(1);
        L.addFirst(2);
        L.addFirst(3);
        L.AnotherIterativeReverse();
        assertEquals(1, L.get(0));
        assertEquals(2, L.get(1));


    }

    @Test
    public void testReverseRecursive(){
        SLList L = new SLList(1);
        L.addFirst(2);
        L.addFirst(3);
        L.reverseRecursive();
        assertEquals(1, L.get(0));
        assertEquals(2, L.get(1));


    }
}