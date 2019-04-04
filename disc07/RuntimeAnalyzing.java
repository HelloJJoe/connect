import org.junit.Test;
import static org.junit.Assert.*;


public class RuntimeAnalyzing {

    public static boolean findSum(int[] array, int target) {
        int i = 0;
        int j = array.length - 1;
        for (int k = 0; i != j; k += 0) {
            if (target - (array[i] + array[j]) > 0) {
                i += 1;
            } else if (target - (array[i] + array[j]) < 0) {
                j -= 1;
            } else {
                return true;
            }
        }
        return false;


    }

    @Test
    public void testFindsum() {
        int[] array = new int[]{0, 7, 9, 12, 16, 17, 20};
        boolean hasFindSum1 = findSum(array, 28);
        boolean hasFindSum2 = findSum(array, 30);
        assertTrue(hasFindSum1);
        assertFalse(hasFindSum2);
    }

}

