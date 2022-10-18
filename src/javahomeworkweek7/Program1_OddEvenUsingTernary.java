//Created by Manisha Mavani
package javahomeworkweek7;
//1. Write a java program that tells us that Input number is odd or even?
import java.util.Scanner;

public class Program1_OddEvenUsingTernary {
    public static void main(String[] args) {
        oddEvenNumber();
    }
    public static void oddEvenNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any number to test whether odd or even : ");
        int num = scanner.nextInt();
        String evenOdd = (num % 2 == 0) ? "even" : "odd"; //ternary operator to check number
        System.out.println(num + " is " + evenOdd +" " + "number");
        scanner.close();
    }
}
