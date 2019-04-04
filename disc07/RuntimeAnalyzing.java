import org.junit.Test;
import java.util.HashSet;
import java.util.Set;

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

    public static int[] union(int[] A, int[] B) {
        Set<Integer> set = new HashSet<>();
        for(int number : A) {
            set.add(number);
        }
        for(int number : B) {
            set.add(number);
        }

        int[] toReturn = new int[set.size()];
        int i = 0;
        for(int number : set) {
            toReturn[i] = number;
            i += 1;
        }

        return toReturn;

    }

    public static int[] intersect(int[] A, int[] B) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> setOfIntersect = new HashSet<>();
        for (int number : A) {
            set.add(number);
        }
        for (int number : B) {
            if (set.contains(number)) {
                setOfIntersect.add(number);
            }
        }
        int[] toReturn = new int[setOfIntersect.size()];
        int i = 0;
        for (int number : setOfIntersect) {
            toReturn[i] = number;
            i += 1;
        }
        return toReturn;
    }

    @Test
    public void testUnion() {
        int[] A = new int[]{1, 2, 3, 4};
        int[] B = new int[]{3, 4, 5, 6};
        int[] expect = new int[]{1, 2, 3, 4, 5, 6};
        int[] actual = union(A, B);
        assertArrayEquals(expect, actual);
    }

    @Test
    public void testIntersect() {
        int[] A = new int[]{1, 2, 3, 4};
        int[] B = new int[]{3, 4, 5, 6};
        int[] expect = new int[]{3, 4};
        int[] actual = intersect(A, B);
        assertArrayEquals(expect, actual);
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

