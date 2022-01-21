package DataTypesAndVariables;

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int tank = 0;//тук ще пълним
        for (int i = 0; i < n; i++) {
            int load = Integer.parseInt(sc.nextLine());
          if(tank+load>255){
              System.out.println("Insufficient capacity!");
              continue;//няма нужда да добавя
          }
            tank += load;
        }
        System.out.println(tank);

    }
}
