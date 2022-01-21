package DataTypesAndVariables;

import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pokePower_N = Integer.parseInt(sc.nextLine());
        int distance_M = Integer.parseInt(sc.nextLine());//намалява силата му
        int exhaustionFactor_Y = Integer.parseInt(sc.nextLine());
        double halfOFN = pokePower_N * 0.5;

        int targetCounter = 0;

        while (pokePower_N >= distance_M) {
            pokePower_N -= distance_M;
            targetCounter++;


            if (pokePower_N == halfOFN && exhaustionFactor_Y != 0) {
                pokePower_N /= exhaustionFactor_Y;
            }
        }



        System.out.printf("%d%n%d", pokePower_N, targetCounter);

    }
}
