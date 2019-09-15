import java.util.Scanner;

public class C112A {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String word1 = s.next();
        String word2 = s.next();
        int result = 0;
        result = word1.compareToIgnoreCase(word2);
        if (result == 0){
            System.out.println(0);
        }
        else if (result < 0){
            System.out.println(-1);
        }
        else
            System.out.println(1);
    }
}
