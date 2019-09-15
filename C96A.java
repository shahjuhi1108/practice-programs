import java.util.Scanner;

public class C96A {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String sequence = s.next();
        int count = 0;
        for (int i = 0; i < (sequence.length()-1); i++){
            if (sequence.charAt(i) == sequence.charAt(i+1)){
                count++;
                if(count >= 6){
                    break;
                }
            }

            else
                count = 0;
        }
        if (count >= 6){
            System.out.println("YES");
        }
        else
            System.out.println("NO");
    }
}
