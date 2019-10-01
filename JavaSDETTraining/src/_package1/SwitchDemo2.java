package _package1;

import java.util.Scanner;

public class SwitchDemo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Month: ");
        int month = input.nextInt();

        int dayInMonth = 0;
        int year = 2000;
        String monthString;

        switch (month) {
            case 1:
                monthString = "January";
                dayInMonth = 31;
                break;
            case 2:
                monthString = "February";
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))){
                    dayInMonth = 29;
                    System.out.println("It is a Leap Year!");
                } else {
                    dayInMonth = 28;
                }
                break;
            case 3:
                monthString = "March";
                dayInMonth= 31;
                break;
            case 4:
                monthString = "April";
                dayInMonth= 30;
                break;
            case 5:
                monthString = "May";
                dayInMonth= 31;
                break;
            case 6:
                monthString = "June";
                dayInMonth= 30;
                break;
            case 7:
                monthString = "July";
                dayInMonth= 31;
                break;
            case 8:
                monthString = "August";
                dayInMonth= 31;
                break;
            case 9:
                monthString = "September";
                dayInMonth= 30;
                break;
            case 10:
                monthString = "October";
                dayInMonth= 31;
                break;
            case 11:
                monthString = "November";
                dayInMonth= 30;
                break;
            case 12:
                monthString = "December";
                dayInMonth= 31;
                break;
            default:
                monthString = "Invalid month";
                break;
        }
        System.out.println(monthString + " has " + dayInMonth);
    }
}
