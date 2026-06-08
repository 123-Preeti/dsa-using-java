public class ArrayOperation {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        arr = insert(arr, 5, 2, 25);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static int[] insert(int[] arr, int n, int position, int value) {

        for (int i = n; i > position; i--) {
            arr[i] = arr[i - 1];
        }

        arr[position] = value;
        return arr;
    }

    public static int deleteValue(int[] arr, int n, int value) {

        int position = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] == value) {
                position = i;
                break;
            }
        }

        if (position == -1) {
            return n;
        }

        for (int i = position; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }

        return n - 1;
    }

    public static int fetch(int[] arr) {
        return arr[0];
    }

    public static int[] rotateRight(int[] arr) {

        int last = arr[arr.length - 1];

        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = last;
        return arr;
    }

    public static int[] rotateLeft(int[] arr) {

        int first = arr[0];

        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[arr.length - 1] = first;
        return arr;
    }
}