package DataTypesAndVariables;

import java.util.Scanner;

public class BeerKegs {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int keg = Integer.parseInt(sc.nextLine());
        double maxVolum = 0;
        String maxKeg = "";
        for (int i = 0; i < keg; i++) {
            String model = sc.nextLine();
            double r = Double.parseDouble(sc.nextLine());
            int h = Integer.parseInt(sc.nextLine());
            double currentVolume = Math.PI * Math.pow(r, 2) * h;
            if (currentVolume > maxVolum) {
                maxVolum = currentVolume;
                maxKeg = model;
            }
        }
        System.out.println(maxKeg);
    }
}
