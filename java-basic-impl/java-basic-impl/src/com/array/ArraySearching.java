public class ArraySearching {

        public static void main(String[] args) {

            int[] arr = {10,20,30,40,50};

            int key = 30;

            boolean found = false;

            for(int i = 0; i < arr.length; i++) {

                if(arr[i] == key) {

                    System.out.println("Found at index " + i);

                    found = true;

                    break;
                }
            }

            if(found == false) {

                System.out.println("Not Found");
            }    }

}

//using mehod

static int linearSearch(int[] arr, int key){

    for(int i = 0; i < arr.length; i++){

        if(arr[i] == key){

            return i;
        }
    }

    return -1;
}



// -------------Binary search
public class Demo {

    public static void main(String[] args) {

        int[] arr = {10,20,30,40,50,60,70};

        int key = 50;

        int low = 0;
        int high = arr.length - 1;

        boolean found = false;

        while(low <= high) {

            int mid = (low + high) / 2;

            if(arr[mid] == key) {

                System.out.println("Found at index " + mid);

                found = true;
                break;
            }

            else if(key > arr[mid]) {

                low = mid + 1;
            }

            else {

                high = mid - 1;
            }
        }

        if(found == false) {

            System.out.println("Not Found");
        }
    }
}


//binary search using methiods
static int binarySearch(int[] arr, int key){

    int low = 0;
    int high = arr.length - 1;

    while(low <= high){

        int mid = (low + high) / 2;

        if(arr[mid] == key){

            return mid;
        }

        else if(key > arr[mid]){

            low = mid + 1;
        }

        else{

            high = mid - 1;
        }
    }

    return -1;
}
