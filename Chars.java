package DataTypesAndVariables;

import java.util.Scanner;

public class Chars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.nextLine().charAt(0);
        char b = sc.nextLine().charAt(0);
        char c = sc.nextLine().charAt(0);

        int number = 0;
        number += a - '0';
        number *= 10;
        number += b - '0';
        number *= 10;
        number += c - '0';
        System.out.println(number);
    }
}
