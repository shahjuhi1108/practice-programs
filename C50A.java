import java.util.Scanner;
import java.lang.Math;
public class C50A {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Integer M = s.nextInt();
        Integer N = s.nextInt();
        Integer d = 2;
        Integer x = (M * N)/d;
        System.out.println((int) Math.floor(x));
    }
}
