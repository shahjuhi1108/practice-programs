import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = 0;
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= 5; j++){
                int a = s.nextInt();
                //System.out.println(a);
                if(a == 1){
                    x = (Math.abs(3-i) + Math.abs(3-j));
                }
            }
        }
        System.out.println(x);
    }
}
