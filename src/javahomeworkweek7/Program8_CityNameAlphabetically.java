//Created By Manisha Mavani
package javahomeworkweek7;
//Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if any other alphabet should be invalid entry
import java.util.Scanner;

public class Program8_CityNameAlphabetically {
    public static void main(String[] args) {
        cityName();
    }

    public static void cityName() {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter any letter between A to F : ");
        char name = obj.next().charAt(0);
        if(name == 'A' || name =='a'){
            System.out.println("City name is Ahmedabad");
        }else if(name == 'B' || name =='b'){
            System.out.println("City name is Bombay");
        }else if(name == 'C' || name == 'c'){
            System.out.println("City name is Chennai");
        }else if(name == 'D' || name == 'd'){
            System.out.println("City name is Delhi");
        }else if(name == 'E' || name == 'e'){
            System.out.println("City name is Erumeli" );
        }else if(name == 'F' || name == 'f'){
            System.out.println("City name is Faridabad ");
        }else{
            System.out.println("Invalid entry allowed only A to F");
        }
        obj.close();
    }

}
