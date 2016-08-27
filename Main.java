import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] a = {5, 4, 6, 8, 7, 3, 2, 1, 9, 55, 95, 66,987,254,324};
        int k = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] < a[j]) {
                    k = a[i];
                    a[i] = a[j];
                    a[j] = k;

                }

            }

        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");


        }


    }
}


