import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayTest{

    @Test
    public void testInsert(){
        int[] arr = new int[]{1, 2, 3};
        int[] insertedArr = Array.insert(arr, 4, 3);
        int[] exp = new int[]{1, 2, 3, 4};
        assertArrayEquals(insertedArr, exp);
    }

    @Test
    public void testReverse(){
        int[] arr = new int[]{1, 2, 3};
        Array.reverse(arr);
        int[] exp = new int[]{3, 2, 1};
        assertArrayEquals(exp, arr);
    }

    @Test
    public void testReplicate(){
        int[] arr = new int[]{1, 2, 3};
        int[] replicate = Array.replicate(arr);
        int[] exp = new int[]{1, 2, 2, 3, 3, 3};
        assertArrayEquals(exp, replicate);
    }
}