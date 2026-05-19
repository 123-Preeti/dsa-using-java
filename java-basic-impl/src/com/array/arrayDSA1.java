import java.util.Arrays;

public class arrayDSA1 {
    public static void main(String[] args) {
       
        int[] transaction = {100,200,300,400,500};
        // for(int i = 0; i < transaction.length; i++){
        //     System.out.println("traversal : "+ transaction[i]);
        // }

        // int position = 1;
        int val = 14;
    //     for(int i= transaction.length - 1; i > position; i--){
    //         transaction[i] = transaction [i-1];
    //     }
    //     transaction[position] = val;
    //     for(int i = 0; i < transaction.length + 1; i++){
    //     System.out.println("insertion: " + transaction[i]);
    // }

    //deletion
        int position = 1;
        for(int i = position; i < transaction.length - 1; i++){
            transaction[i] = transaction[i + 1];
        }
        for(int i = 0; i < transaction.length - 1; i++){
            System.out.println("deletion: " + transaction[i]);
        }

        //updation

        int[] arr = {70,80,90};

        // Update
        arr[1] = 85;

        // Print array
        for(int i = 0; i < arr.length; i++) {

            System.out.println("updation: " + arr[i]);
        }

        //sorting

             int[] arr1 = {70,80,90};

        // Update
        arr1[1] = 85;

        // Print array
        for(int i = 0; i < arr1.length; i++) {
            Arrays.sort(arr1);
            System.out.println("sorting: " + arr1[i]);
        }

        //copying
       
        int arra[] = {100,200,300,400,500};
        int arr2[] = new int[arra.length];

        for(int i = 0; i < arr1.length; i++){
            arr2[i] = arra[i];
        }

        for(int i =0; i < arr2.length; i++){
            System.out.println("copying: " + arr2[i]);
        }

        //2d array
    
        int[][] arr = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        for(int i = 0; i < arr.length; i++) {

            for(int j = 0; j < arr[i].length; j++) {

                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }
    }

}
