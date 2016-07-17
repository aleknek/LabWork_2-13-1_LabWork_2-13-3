package com.brainacad.oop.testenum1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        for (MyDayOfWeek day : MyDayOfWeek.values()) {
            switch (day) {
                case MONDAY:
                case WEDNESDAY:
                case FRIDAY:
                    System.out.println("My Java day: " + day);
                    break;
            }
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day of the week: ");

        String str = sc.nextLine();

        MyDayOfWeek day = MyDayOfWeek.valueOf(str);
        System.out.println(day.nextDay());
    }
}



