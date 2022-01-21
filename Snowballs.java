package DataTypesAndVariables;

import java.util.Scanner;

public class Snowballs {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfSnowBalls = Integer.parseInt(sc.nextLine());
        double maxSnowBallValue = 0;
        int maxSnowBallSnow = 0;
        int maxSnowBallTime = 0;
        int maxSnowBallQuality = 0;


        for (int i = 0; i < numberOfSnowBalls; i++) {
            int snowBallSnow = Integer.parseInt(sc.nextLine());
            int snowBallTime = Integer.parseInt(sc.nextLine());
            int snowBallQuality = Integer.parseInt(sc.nextLine());
            double currentSnowBallValue = Math.pow((snowBallSnow / snowBallTime), snowBallQuality);
            if (currentSnowBallValue > maxSnowBallValue) {
                maxSnowBallValue = currentSnowBallValue;
                maxSnowBallSnow = snowBallSnow;
                maxSnowBallTime = snowBallTime;
                maxSnowBallQuality = snowBallQuality;


            }

        }

        System.out.printf("%d : %d = %.0f (%d)", maxSnowBallSnow, maxSnowBallTime, maxSnowBallValue, maxSnowBallQuality);

    }
}
