import org.junit.Test;
import static org.junit.Assert.*;

public class IntListTest{

    @Test
    public void testSkippify(){
        IntList A = IntList.of(1, 2, 3 , 4, 5, 6, 7, 8, 9);
        IntList B = IntList.of(1, 3, 6);
        A.skippify();
        assertEquals(B, A);
    }

    @Test
    public void testSkippify2(){
        IntList A = IntList.of(15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1);
        IntList B = IntList.of(15, 13, 10, 6, 1);
        A.skippify();
        assertEquals(B, A);
    }

    @Test
    public void testRemoveDuplicates(){
        IntList A = IntList.of(1, 2, 2, 2, 3);
        IntList exp = IntList.of(1, 2, 3);
        IntList.removeDuplicates(A);
        assertEquals(exp, A);
    }
}