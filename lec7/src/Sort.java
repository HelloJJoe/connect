public class Sort {

    public static void sort(String[] x) {

        sort(x, 0);
    }

    public static void sort(String[] x, int start){
        if(start > x.length - 1){
            return;
        }
        int smallIndex = findMininum(x, start);
        swap(x, start, smallIndex);
        sort(x, start + 1);

    }

    public static int findMininum(String[] x, int start){
        int minIndex = start;
        for(int i = start; i < x.length; i++){
            int cmp = x[i].compareTo(x[minIndex]);
            if(cmp < 0){
                minIndex = i;
            }
        }

        return minIndex;
    }

    public static String[] swap(String[] x, int a, int b){
        String temp = x[a];
        x[a] = x[b];
        x[b] = temp;
        return x;
    }
}
