//Created By Manisha Mavani
package javahomeworkweek7;
//Write a java program to input any year like (ex.2007) and find out if it is leap year or not?
import java.util.Scanner;

public class Program2_LeapYear {
    public static void main(String[] args) {
        leapYear();
    }

    public static void leapYear() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any year : ");
        int year = scanner.nextInt();
        if(year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + "is leap year. ");
        }else if(year %400 == 0){
            System.out.println(year +" "+ "is leap year. ");
        }else{
            System.out.println(year +" "+ "is not leap year. ");
        }
    }
}
