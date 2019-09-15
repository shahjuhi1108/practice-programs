import java.math.BigDecimal;
import java.util.Scanner;

public class Theatresquare {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BigDecimal n = s.nextBigDecimal();
        BigDecimal m = s.nextBigDecimal();
        BigDecimal a = s.nextBigDecimal();
        BigDecimal x = n.divide(a, BigDecimal.ROUND_CEILING);
        BigDecimal y = m.divide(a, BigDecimal.ROUND_CEILING);
        BigDecimal z = x.multiply(y);
        System.out.println(z.toPlainString());
    }
}
