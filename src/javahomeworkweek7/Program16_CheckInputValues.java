//Created By Manisha Mavani
package javahomeworkweek7;
//Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or “ZERO”
import java.util.Scanner;

public class Program16_CheckInputValues {
    public static void main(String[] args) {
        inputValues();
    }

    public static void inputValues(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int num = scanner.nextInt();
        if(num==0){
            System.out.println("Enter number is ZERO");
        }else if(num>=1){
            System.out.println("Enter number is Positive");
        }else{
            System.out.println("Enter number is Negative");
        }

    }
}
