import java.util.Collections;
import java.util.Scanner;
import static java.util.Arrays.sort;

public class Nextround {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        Integer[] a = new Integer[n];
        for (int i = 0; i < n; i++) {
                int x = s.nextInt();
                a[i] = x;
        }
        sort(a, Collections.reverseOrder());


        int y = 0;
        while (y < k){
                if(!a[y].equals(0)){
                    y++;
                }
                else{
                    System.out.println(y);
                    return;
                }
        }

        while (y < n  && a[y-1].equals(a[y])){
            y++;
        }
        System.out.println(y);
    }
}
