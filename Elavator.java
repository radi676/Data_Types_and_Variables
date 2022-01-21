package DataTypesAndVariables;

import java.util.Scanner;

public class Elavator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n_persons = Integer.parseInt(sc.nextLine());
        int p_persons = Integer.parseInt(sc.nextLine());
        int courses = 0;
        if (n_persons% p_persons == 0) {
            courses = n_persons / p_persons;
        } else {
            courses = (n_persons / p_persons) + 1;
        }
        System.out.println(courses);
    }


}



