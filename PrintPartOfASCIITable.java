package DataTypesAndVariables;

import java.util.Scanner;

public class PrintPartOfASCIITable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = Integer.parseInt(sc.nextLine());
        int end = Integer.parseInt(sc.nextLine());

        for (int i = start; i <= end; i++) {
            char symbol = (char) i;//кастване!!
            System.out.print(symbol + " ");

          //  System.out.printf("%s", i);-cast

        }

    }


}
