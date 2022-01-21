package DataTypesAndVariables;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int num = Integer.parseInt(input);;
        int sum = 0;


        for (int i = 0; i < input.length(); i++) {

            int digit = num % 10;
            num /= 10;
            sum += digit;

        }
        System.out.println(sum);
    }
}
