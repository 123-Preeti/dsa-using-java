public class array1 {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,10,23,45,81};

        // Print all numbers
        System.out.println("All Numbers:");
        for (int i = 0; i < arr.length; i++) {

            System.out.println(arr[i]);
        }


        // Print even numbers
        System.out.println("\nEven Numbers:");
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {

                System.out.println(arr[i]);
            }
        }


        // Print numbers at even index
        System.out.println("\nNumbers At Even Index:");
        for (int i = 0; i < arr.length; i++) {

            if (i % 2 == 0) {

                System.out.println(arr[i]);
            }
        }


        // Print even numbers followed by odd numbers
        System.out.println("\nEven Numbers Followed By Odd Numbers:");

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {

                System.out.println(arr[i]);
            }
        }

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 != 0) {

                System.out.println(arr[i]);
            }
        }


        // Print 2-digit numbers
        System.out.println("\n2 Digit Numbers:");

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > 9 && arr[i] < 100) {

                System.out.println(arr[i]);
            }
        }


        // Print square root
        System.out.println("\nSquare Root:");

        for (int i = 0; i < arr.length; i++) {

            System.out.printf("%.2f%n", Math.sqrt(arr[i]));
        }


        // Print cube
        System.out.println("\nCube:");

        for (int i = 0; i < arr.length; i++) {

            System.out.printf("%.2f%n", Math.pow(arr[i], 3));
        }


        // Sum of even numbers
        double evenSum = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {

                evenSum = evenSum + arr[i];
            }
        }

        System.out.println("\nSum of Even Numbers: " + evenSum);


        // Sum of odd numbers
        double oddSum = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 != 0) {

                oddSum = oddSum + arr[i];
            }
        }

        System.out.println("Sum of Odd Numbers: " + oddSum);


        // Sum of 2-digit numbers
        double twoDigitSum = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > 9 && arr[i] < 100) {

                twoDigitSum = twoDigitSum + arr[i];
            }
        }

        System.out.println("Sum of 2 Digit Numbers: " + twoDigitSum);


        // Sum of positive numbers
        double positiveSum = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > 0) {

                positiveSum = positiveSum + arr[i];
            }
        }

        System.out.println("Sum of Positive Numbers: " + positiveSum);


        // Product of even numbers
        double evenProd = 1;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {

                evenProd = evenProd * arr[i];
            }
        }

        System.out.println("Product of Even Numbers: " + evenProd);


        // Product of odd numbers
        double oddProd = 1;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 != 0) {

                oddProd = oddProd * arr[i];
            }
        }

        System.out.println("Product of Odd Numbers: " + oddProd);


        // Product of 2-digit numbers
        double twoDigitProd = 1;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > 9 && arr[i] < 100) {

                twoDigitProd = twoDigitProd * arr[i];
            }
        }

        System.out.println("Product of 2 Digit Numbers: " + twoDigitProd);


        // Product of positive numbers
        double positiveProd = 1;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > 0) {

                positiveProd = positiveProd * arr[i];
            }
        }

        System.out.println("Product of Positive Numbers: " + positiveProd);


        // Count of even numbers
        int evenCount = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {

                evenCount++;
            }
        }

        System.out.println("Count of Even Numbers: " + evenCount);


        // Count divisible by 5
        int div5Count = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 5 == 0) {

                div5Count++;
            }
        }

        System.out.println("Count Divisible By 5: " + div5Count);


        // Count of 3-digit numbers
        int threeDigitCount = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > 99 && arr[i] < 1000) {

                threeDigitCount++;
            }
        }

        System.out.println("Count of 3 Digit Numbers: " + threeDigitCount);


        // Count of numbers ending with 5
        int ending5Count = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 10 == 5) {

                ending5Count++;
            }
        }

        System.out.println("Count of Numbers Ending With 5: " + ending5Count);
    }
}