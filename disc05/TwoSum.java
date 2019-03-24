import java.util.HashSet;
import java.util.Set;

public class TwoSum {
    public static boolean twoSum(int[] A, int k) {
        Set<Integer> map = new HashSet<>();
        for(int item : A) {
            if(map.contains(item)) {
                return true;
            } else {
                map.add(k - item);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        int k = Integer.parseInt(args[0]);
        boolean hasTwoSum = twoSum(array, k);
        System.out.println(hasTwoSum);
        
    }
}

