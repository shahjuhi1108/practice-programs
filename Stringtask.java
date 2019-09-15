import java.util.Scanner;

public class Stringtask {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String words = s.next();
        StringBuilder sb = new StringBuilder();
        for (char c : words.toCharArray()) {
            if (c != 'a' && c != 'e' && c != 'i'  && c != 'o' && c != 'u' && c != 'y' && c != 'A' && c != 'E' && c != 'I' && c != 'O' && c != 'U' && c != 'Y'){
                sb.append('.');
                if('A' <= c && c <= 'Z'){
                    c = (char) (c + ('a' - 'A'));
                }
                sb.append(c);
            }
        }
        System.out.println(sb);
    }
}
