import java.util.Scanner;

public class Watermelon {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if (n % 2 == 0 && n > 2){
            System.out.println("Yes");
        }
        else
            System.out.println("No");
    }
}
