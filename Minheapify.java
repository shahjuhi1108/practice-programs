import java.util.Arrays;
import java.util.Scanner;

//Iterative method.

public class Minheapify {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            int x = s.nextInt();
            a[i] = x;
        }
        a = min_heapify(a,0);
        System.out.println(Arrays.toString(a));
    }

    private static int[] min_heapify(int z[], int p){
        while(p <= z.length){
            int l = (2*p)+1;
            int r = (2*p)+2;
            int smallest = p;
            if(l < z.length && z[p] > z[l]){
                smallest = l;
            }
            if(r < z.length && z[r] < z[smallest]){
                smallest = r;
            }
            if(p != smallest){
                int temp = z[smallest];
                z[smallest] = z[p];
                z[p] = temp;
                p = smallest;
            }
            else
                break;
        }
        return z;
    }
}


/*

10
16 4 10 14 7 9 3 2 8 1


*/
