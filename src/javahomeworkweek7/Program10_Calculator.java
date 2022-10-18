//Created By Manisha Mavani
package javahomeworkweek7;
//Write a java program to input any two number and ask user to enter their symbol (+, -, /, *) find addition, Subtraction, multiplication and division according to their symbol (using if else)
import java.util.Scanner;

public class Program10_Calculator {
    public static void main(String[] args) {
        calculator();
    }

    public static void calculator() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number:");
        double a = scanner.nextDouble();
        System.out.print("Enter the second number:");
        double b = scanner.nextDouble();
        System.out.println("Please select the any operation : '+' , '-' , '*' , '/'");
        char operator = scanner.next().charAt(0);
        if (operator == '+') {                      //If statement use for selecting different operations for calculator
            System.out.println("Result is : "+ (a+b));
        }
        if (operator == '-') {
            System.out.println("Result is : "+ (a-b));
        }
        if (operator == '*') {
            System.out.println("Result is : "+(a*b));
        }
        if (operator == '/') {
            System.out.println("Result is : "+(a/b));
        }
        scanner.close();

    }
}
