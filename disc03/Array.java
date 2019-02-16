public class Array{

    private int[] item;
    private int size;

    public Array(){
        this.item = new int[3];
    }
    public static int[] insert(int[] arr, int item, int position) {
        int[] newArr = new int[arr.length + 1];
        position = Math.min(position, arr.length);
        for(int i = 0; i < position; i++){
            newArr[i] = arr[i];
        }
        newArr[position] = item;
        for(int i = position ; i < arr.length; i++ ){
            newArr[i + 1] = arr[i];
        }

        return newArr;

    }

    public static void reverse(int[] arr){
        for(int i = 0; i < arr.length / 2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 -i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    public static  int[] replicate(int[] arr){
        int total = 0;
        for(int item : arr ){
            total += item;
        }
        int[] newArr = new int[total];
        int counter = 0;
        for(int item : arr){
            for(int j = 0; j < item; j++){
                newArr[counter] = item;
                counter++;
            }
        }
        return newArr;
    }

    public static int[] flatten(int[][] arr){
        int totalLength = 0;

        for(int i = 0; i < arr.length; i++){
            totalLength += arr[i].length;
        }

        int[] result = new int[totalLength];
        int counter = 0;

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                result[counter] = arr[i][j];
                counter++;
            }
        }
        return result;


    }
}