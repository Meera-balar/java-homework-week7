//Created By Manisha Mavani
//Write a Java program to test if an array contains a specific value.
package javahomeworkweek7;

import java.util.Arrays;
import java.util.Scanner;

public class Program20_TestArraySpecificValue {
    public static void main(String[] args) {

        arraySpecific();
    }
    public static void arraySpecific() {
        int a[] = {1, 2, 3, 4, 5, 7, 8, 9};
        System.out.println("Array is : " + Arrays.toString(a));
        Scanner scanner = new Scanner(System.in);
        System.out.print("Testing specific value is = ");
        int num = scanner.nextInt();

        for (int i = 0; i < a.length; i++) {
            if (a[i] == num) {
                System.out.println("Array contains this value");
                System.exit(0);
            }
        } System.out.println("this is not in array");
    }
}



