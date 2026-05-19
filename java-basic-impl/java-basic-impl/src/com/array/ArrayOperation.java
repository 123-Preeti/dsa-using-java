import java.lang.reflect.Array;

public class ArrayOperation {
     public static void main(String[] args){
         int arr = new arr[1,2,3,4,5,6,7,8,9];
     }
    static int insert(Array arr){

         //1 ) manually insertion

        public class Demo {

            public static void main(String[] args) {

                int[] arr = new int[6];

                arr[0] = 10;
                arr[1] = 20;
                arr[2] = 30;
                arr[3] = 40;
                arr[4] = 50;

                int position = 2;
                int value = 25;
                int n = 5;

                // Shift right
                for(int i = n; i > position; i--){

                    arr[i] = arr[i - 1];
                }

                // Insert
                arr[position] = value;

                // Print
                for(int i = 0; i <= n; i++){

                    System.out.println(arr[i]);
                }
            }
        }
    }

    //insertion at beginning
    for(int i = n; i > 0; i--){

        arr[i] = arr[i - 1];
    }

    arr[0] = 5;

    //insertion at end
    int position = 2;

for(int i = position; i < n - 1; i++){

        arr[i] = arr[i + 1];
    }


//using methods
public static int[] insert(int[] arr, int n, int position, int value) {

    for(int i = n; i > position; i--) {

        arr[i] = arr[i - 1];
    }

    arr[position] = value;

    return arr;
}
    static int delete(Array arr){

    //1) delete from end
        public class DeleteEnd {

            public static void main(String[] args) {

                int[] arr = {10,20,30,40,50};

                int n = arr.length;

                // Reduce size
                n--;

                // Print updated array
                for(int i = 0; i < n; i++) {

                    System.out.println(arr[i]);
                }
            }
        }

        //2) delete from particular index
        public class DeleteIndex {

            public static void main(String[] args) {

                int[] arr = {10,20,30,40,50};

                int n = arr.length;
                int position = 2;

                // Shift left
                for(int i = position; i < n - 1; i++) {

                    arr[i] = arr[i + 1];
                }

                n--;

                // Print updated array
                for(int i = 0; i < n; i++) {

                    System.out.println(arr[i]);
                }
            }
        }

        //3) delete a particular value
        public class DeleteValue {

            public static void main(String[] args) {

                int[] arr = {10,20,30,40,50};

                int n = arr.length;
                int value = 40;

                int position = -1;

                // Find index
                for(int i = 0; i < n; i++) {

                    if(arr[i] == value) {

                        position = i;
                        break;
                    }
                }

                // Delete if found
                if(position != -1) {

                    for(int i = position; i < n - 1; i++) {

                        arr[i] = arr[i + 1];
                    }

                    n--;

                    // Print updated array
                    for(int i = 0; i < n; i++) {

                        System.out.println(arr[i]);
                    }
                }
                else {

                    System.out.println("Value not found");
                }
            }
        }

        //4) delete using mehods
        public static int deleteValue(int[] arr, int n, int value) {

            int position = -1;

            // Find value
            for(int i = 0; i < n; i++) {

                if(arr[i] == value) {

                    position = i;
                    break;
                }
            }

            // If not found
            if(position == -1) {

                return n;
            }

            // Shift left
            for(int i = position; i < n - 1; i++) {

                arr[i] = arr[i + 1];
            }

            return n - 1;
        }
    }

    static int fetch(Array arr){
//    1) return first element
        public class Demo {

            static int fetch(int[] arr){

                return arr[0];
            }

            public static void main(String[] args) {

                int[] arr = {10,20,30};

                int result = fetch(arr);

                System.out.println(result);
            }
        }
    }

//reverse array
    public class Demo {

        static int[] rotate(int[] arr){

            int last = arr[arr.length - 1];

            // Shift right
            for(int i = arr.length - 1; i > 0; i--){

                arr[i] = arr[i - 1];
            }

            // Put last at first
            arr[0] = last;

            return arr;
        }

        public static void main(String[] args) {

            int[] arr = {10,20,30,40,50};

            arr = rotate(arr);

            for(int i = 0; i < arr.length; i++){

                System.out.println(arr[i]);
            }
        }
    }
}

//reverse array - 2
public class Demo {

    static int[] rotateLeft(int[] arr){

        int first = arr[0];

        // Shift left
        for(int i = 0; i < arr.length - 1; i++){

            arr[i] = arr[i + 1];
        }

        arr[arr.length - 1] = first;

        return arr;
    }

    public static void main(String[] args) {

        int[] arr = {10,20,30,40,50};

        arr = rotateLeft(arr);

        for(int i = 0; i < arr.length; i++){

            System.out.println(arr[i]);
        }
    }
}
