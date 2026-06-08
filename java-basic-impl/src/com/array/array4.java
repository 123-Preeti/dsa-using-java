public class array4 {
    public static void main(String[] args) {

        int[] M = {92, 82, 85, 91, 94};
        String[] name = {"Sam", "Maya", "Joe", "Rohit", "Nihir"};

        for (int i = 0; i < M.length; i++) {
            if (M[i] > 90) {
                System.out.println(name[i] + ": " + M[i]);
            }
        }

        int idx = -1;
        String s = "Rohit";
        int N = name.length;
        int L = 0, H = N - 1;

        while (L <= H) {
            int mid = (H + L) / 2;
            int c = s.compareToIgnoreCase(name[mid]);

            if (c == 0) {
                idx = mid;
                break;
            } else if (c < 0) {
                H = mid - 1;
            } else {
                L = mid + 1;
            }
        }

        if (idx == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Found at index: " + idx);
        }
    }
}