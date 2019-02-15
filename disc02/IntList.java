public class IntList {
    public int first;
    public IntList rest;        

    public IntList(int f, IntList r) {
        first = f;
        rest = r;
    }

    public int size(){

        if(rest == null){
            return 1;
        }
        return 1 + this.rest.size();

    }

    public int getR(int n){

        if(n == 0){
            return first;
        }
        return rest.get(n - 1);
    }

    public int iteratizeSize(){
    	int size = 0;
    	IntList l = this;
    	while(l != null){
    		size++;
    		l = l.rest;
    	}
    	return size;
    }

    public int get(int n){
        int counter = 0;
        IntList l = this;
        while(counter < n){
            l = l.rest;
            counter++;
        }
        return l.first;
    }


    public static IntList square(IntList L){
        if(L.rest == null){
            return null;
        }
        return new IntList(L.first * L.first, square(L.rest));
    }
    public static IntList squareIterative(IntList L){
        IntList L2 = new IntList(L.first * L.first, null);
        IntList ptr = L2;
        L = L.rest;
        while(L != null){
            ptr.rest = new IntList(L.first * L.first, null);
            ptr = ptr.rest;
            L = L.rest;
        }
        return L2;
    }

    public static IntList squareMutative(IntList L) {
        if(L == null){
            return null;
        }
        L.first = L.first * L.first;
        return IntList.squareMutative(L.rest);
    }

    public static IntList squareMutativeIterative(IntList L) {
        IntList temp = L;
        while(L != null){
            L.first = L.first * L.first;
            L = L.rest;
        }
        return temp;
    }

    public static void main(String[] args){

    	IntList L = new IntList(5, null);
		//L.rest = new IntList(10, null);
        IntList L2 = IntList.square(L);
        System.out.println(L2.get(0));
        // IntList L3 = IntList.squareIterative(L);
        // System.out.println(L3.get(1));
        // IntList L4 = IntList.squareMutativeIterative(L);
        // System.out.println(L4.get(0));
        // IntList.squareMutative(L);
        System.out.println(L.get(1));





    }
}


public class QuikMaths {
    public static void mulitplyBy3(int[] A) {
       for (int x: A) {
          x = x * 3;
       }
    }

    public static void main(String[] args){
        int[] arr;
        arr = new int[]{2,3,3,4};
        mulitplyBy3(arr);
    }
}