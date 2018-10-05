package com.seb;
import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int num;
        String anotherNumber = "n";

        do {
            System.out.println("Enter a number ");
            num = keyboard.nextInt();

            keyboard.nextLine();

            for (int cnt = num; cnt >= 5; cnt--) {
                if (cnt % 7 == 0) {
                    System.out.println(cnt);
                } else if (cnt % 5 == 0) {
                    System.out.println(cnt);
                }

                } System.out.println("Would you like to enter another number(y/n): ");
                  anotherNumber = keyboard.nextLine();

        } while (anotherNumber.equals("y"));

        System.out.println("Thank you for playing!");
    }

}