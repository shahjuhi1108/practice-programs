import java.util.Arrays;
import java.util.Scanner;

//Recursion method.

public class Maxheapifyr {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            int x = s.nextInt();
            a[i] = x;
        }
        max_heapify(a,1);
        System.out.println(Arrays.toString(a));
    }

    private static void max_heapify(int z[], int p) {
        int l = (2 * p) + 1;
        int r = (2 * p) + 2;
        int largest;

        if (l < z.length && z[p] < z[l]) {
            largest = l;
        }

        else
            largest = p;

        if (r < z.length && z[r] > z[largest]) {
            largest = r;
        }

        if (p != largest) {
            int temp = z[largest];
            z[largest] = z[p];
            z[p] = temp;
            max_heapify(z, largest);
        }
    }
}


/*

10
16 4 10 14 7 9 3 2 8 1


*/
