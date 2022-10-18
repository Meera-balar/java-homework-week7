//Created By Manisha Mavani
package javahomeworkweek7;
/*Write a Java program which input any number between 1 to 7 and it print The Days name MONDAY, TUESDAY…..SUNDAY of the week accordingly by using switch.
NOTE: if number is out of selection Print message “Week contains 1 to 7 days”
*/
import java.util.Scanner;

public class Program13_DaysNameInWeek {
    public static void main(String[] args) {
        dayNames();
    }

    public static void dayNames() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any number between 1 to 7 : ");
        int num = scanner.nextInt();
        switch (num){
            case 1:
                System.out.println("The day name is MONDAY");
                break;
            case 2:
                System.out.println("The day name is TUESDAY");
                break;
            case 3:
                System.out.println("The day name is WEDNSDAY");
                break;
            case 4:
                System.out.println("The day name is THURSDAY");
                break;
            case 5:
                System.out.println("The day name is FRIDAY");
                break;
            case 6:
                System.out.println("The day name is SATURDAY");
                break;
            case 7:
                System.out.println("The day name is SUNDAY");
                break;
            default:
                System.out.println("Week contains 1 to 7 days");
        }

    }
}
