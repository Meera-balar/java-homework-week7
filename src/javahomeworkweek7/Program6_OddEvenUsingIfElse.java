//Created By Manisha Mavani
package javahomeworkweek7;
//Write a java program to input any number and find out if it’s odd or even
import java.util.Scanner;

public class Program6_OddEvenUsingIfElse {
    public static void main(String[] args) {
        oddEven();
    }

    public static void oddEven(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any Number : ");
        int num = scanner.nextInt();
        if(num% 2==0){
            System.out.println(num + " is Even Number. ");
        }else{
            System.out.println(num + " is Odd Number. ");
        }
    }
}
