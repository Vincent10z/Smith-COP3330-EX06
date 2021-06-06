/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Vincent Smith
 */


import java.util.Calendar;
import java.util.Scanner;

public class EX06 {

    public static void main(String[] args){

        int year = Calendar.getInstance().get(Calendar.YEAR);
        Scanner enter = new Scanner(System.in);
        System.out.println("What is your current age?");
        String age = enter.nextLine();
        int a = Integer.parseInt(age);

        System.out.println("At what age would you like to retire?");
        String retire = enter.nextLine();
        int b = Integer.parseInt(retire);

        System.out.println("It's " +year+ ", so you can retire in " +((b-a)+year));


    }
}
