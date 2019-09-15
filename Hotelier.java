import java.util.Scanner;

public class Hotelier {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String sequence = s.next();
        int[] a = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0; i < n; i++) {
            if (sequence.charAt(i) == 'L') {
                for (int j = 0; j < 10; j++) {
                    if (a[j] == 0) {
                        a[j] = 1;
                        break;
                    }
                }
            } else if (sequence.charAt(i) == 'R') {
                for (int j = 9; j >= 0; j--) {
                    if (a[j] == 0) {
                        a[j] = 1;
                        break;
                    }
                }
            }
            else {
                char x = sequence.charAt(i);
                int y = Character.getNumericValue(x);
                a[y] = 0;
            }
        }

        for (int z = 0; z < 10; z++) {
            System.out.print(a[z]);
        }
    }
}
