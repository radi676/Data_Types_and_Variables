package DataTypesAndVariables;

import java.util.Scanner;

public class SumDigitsWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        int sum = 0;
        while (number != 0) {
            int digit = number % 10;
            number /= 10;
            sum += digit;

        }

        System.out.println(sum);
    }


}
