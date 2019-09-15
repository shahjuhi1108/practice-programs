import java.util.Scanner;
import static java.util.Arrays.sort;

public class C339A {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        int n = str.length();
        int[] a = new int[(n/2)+1];
        int i = 0;
        for (char c : str.toCharArray()){
            if (c != '+'){
                int x = (int) c;
                a[i]=x;
                i++;
            }
        }
        sort(a);
        StringBuilder sb = new StringBuilder();
        sb.append((char)a[0]);
        for(i = 1; i < a.length; i++){
            sb.append('+');
            sb.append((char)a[i]);
        }
        System.out.println(sb);
    }
}
