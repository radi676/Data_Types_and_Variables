package DataTypesAndVariables;

import java.math.BigDecimal;
import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigDecimal numberA = new BigDecimal(sc.nextLine());
        BigDecimal numberB = new BigDecimal(sc.nextLine());

        BigDecimal result = numberA.add(numberB);
        System.out.println(result);

    }
}
