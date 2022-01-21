package DataTypesAndVariables;

import java.util.Scanner;

public class spiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       int startingYield=Integer.parseInt(scanner.nextLine());// indicates how much spice can be mined on the first day
        int amount=0;
        int days=0;

        while (startingYield>0) {
            if (startingYield<100){
                if (amount<26){
                    break;
                }
                amount-=26;
                break;
            }
            amount+=startingYield-26;
            startingYield-=10;

            days++;
        }
        System.out.println(days);
        System.out.println(amount);

    }
        }





