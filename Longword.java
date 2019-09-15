import java.util.Scanner;

public class Longword {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String word = null;
        for (int i = 0; i < n; i++) {
            word = s.next();
            int count = word.length();
            if (count > 10) {
                count -= 2;
                word = new StringBuilder().append(word.charAt(0)).append(count).append(word.charAt(word.length() - 1)).toString();
            }
            System.out.println(word);
        }
    }
}
