//Created By Manisha Mavani
package javahomeworkweek7;
//Same as above program-8 using switch statement.
import java.util.Scanner;

public class Program9_CityNameAlphabeticallyUsingSwitch {
    public static void main(String[] args) {
        cityName1();
    }

    public static void cityName1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any letter between A to F : ");
        char name = scanner.next().charAt(0);
        switch (name){
            case 'A':
                System.out.println("City name is Ahmedabad");
                break;
            case 'B':
                System.out.println("City name is Bombay");
                break;
            case 'C':
                System.out.println("City name is Chennai");
                break;
            case 'D':
                System.out.println("City name is Delhi");
                break;
            case 'E':
                System.out.println("City name is Erumeli");
                break;
            case 'F':
                System.out.println("City name is Faridabad");
                break;
            default:
                System.out.println("Invalid entry allowed only A to F");

        }
    }
}


