//Created by Manisha Mavani
package javahomeworkweek7;
// Write a program to find number of days in month
import java.util.Scanner;

public class Program4_DaysInMonth {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Year : ");
        int a = obj.nextInt();
        isLeapYear(a);
        System.out.println("Enter Month : ");
        int b = obj.nextInt();
        getDaysInMonth(b,a);

    }

    public static void isLeapYear(int year) {
        if (year < 1 || year >= 9999) {
            System.out.println("False");
        } else if ((year % 4 == 0) && year % 100 != 0) {
            System.out.println("True");
        } else if (year % 400 == 0) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }


    public static void getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            System.out.println("-1 since parameter is Invalid");

        }
        switch (month) {
            case 1:
                if (year < 1 || year > 9999) {
                    System.out.println("");
                } else {
                    System.out.println("January month has 31 days");
                }
                break;
            case 2:
                if (year < 1 || year >= 9999) {
                } else if ((year % 4 == 0) && year % 100 != 0) {
                    System.out.println("February month has 29 days as this is leap year");
                } else if (year % 400 == 0) {
                    System.out.println("February month has 29 days as this is leap year");
                } else {
                    System.out.println("February month has 28 days as this is not leap year");
                }
                break;
            case 3:
                if (year < 1 || year > 9999 ) {
                    System.out.println("");
                } else {
                    System.out.println("March month has 31 days");
                }

                break;
            case 4:
                if (year < 1 || year > 9999) {
                    System.out.println("");
                } else {
                    System.out.println("April month has 30 days");
                }

                break;
            case 5:
                if (year < 1 || year > 9999) {
                    System.out.println("");
                } else {
                    System.out.println("May month has 31 days");
                }

                break;
            case 6:
                if (year < 1 || year > 9999) {
                    System.out.println("");
                } else {
                    System.out.println("June month has 30 days");
                }

                break;
            case 7:
                if (year < 1 || year > 9999) {
                    System.out.println("");
                } else {
                    System.out.println("July month has 31 days");
                }

                break;
            case 8:
                if (year < 1 || year > 9999) {
                    System.out.println("");
                } else {
                    System.out.println("August month has 31 days");
                }

                break;
            case 9:
                if (year < 1 || year > 9999) {
                    System.out.println("");
                } else {
                    System.out.println("September month has 30 days");
                }

                break;
            case 10:
                if (year < 1 || year > 9999) {
                    System.out.println("");
                } else {
                    System.out.println("October month has 31 days");
                }
                break;
            case 11:
                if (year < 1 || year > 9999) {
                    System.out.println("");
                } else {
                    System.out.println("November month has 30 days");
                }

                break;
            case 12:
                if (year < 1 || year > 9999) {
                    System.out.println("");
                } else {
                    System.out.println("December month has 31 days");
                }

                break;

        }
    }
}
