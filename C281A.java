import java.util.Scanner;

public class C281A {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        char c = str.charAt(0);
        if('A' <= c && c <= 'Z'){
            System.out.println(str);
        }
        else{
            char c1 = (char) (c - ('a' - 'A'));
            System.out.println(str.replaceFirst(Character.toString(c), Character.toString(c1)));
        }
    }
}
