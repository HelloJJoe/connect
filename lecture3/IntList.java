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

    public static void main(String[] args){

    	IntList L = new IntList(5, null);
		L.rest = new IntList(10, null);
		L.rest.rest = new IntList(15, null);
		// System.out.println(L.iteratizeSize());
  //       System.out.println(L.size());
        System.out.println(L.get(2));
        System.out.println(L.getR(2));



    }
}