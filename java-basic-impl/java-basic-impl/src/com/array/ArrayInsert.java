public class ArrayInsert {
    int count = 0;

    public static void main(String[] args) {

        ArrayInsert o = new ArrayInsert();

        int a[] = new int[10]; //creating array of 10 size
//        a[0] = 10;
//        a[1] = 20;
//        a[2] = 30;
//        a[3] = 40;
//        a[5] = 50;

//inserting array
        for (int j = 0; j < a.length; j++) {
            o.insert(a, j);
        }

//printing array
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

        public void insert(int[] a, int val){
        if(count < a.length){
            a[count] = val;
            count++;
        }
        else{
            System.out.println("array full");
        }
        }
}
