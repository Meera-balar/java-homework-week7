//Created By Manisha Mavani
package javahomeworkweek7;
//Write a program that tells us input value is number or an alphabet or symbol.
import java.util.Scanner;

public class Program12_InputValueTypes {
    public static void main(String[] args) {
        typesOfValues();
    }

    public static void typesOfValues() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter any value either number or either alphabet or either symbol : ");
        char value = scanner.next().charAt(0);

        if((value >= 'a' && value <= 'z') || (value >= 'A' && value <= 'Z')){
            System.out.println(value + " is a ALPHABET.");
        }else if (value >= '0' && value <='9'){
            System.out.println(value + " is a Number.");
        }else{
            System.out.println(value +" "+ " is A SPECIAL CHARACTER.");
        }
    }
}
