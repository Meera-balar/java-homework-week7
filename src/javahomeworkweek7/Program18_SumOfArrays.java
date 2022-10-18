//Created By Manisha Mavani
package javahomeworkweek7;
//Write a Java program to sum values of an array.
import java.util.Arrays;

public class Program18_SumOfArrays {
    public static void main(String[] args) {
        SumOfArrays();
    }

    public static void SumOfArrays() {
        //initialize array
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Array is " + Arrays.toString(a));
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
           sum = sum + a[i];
        }
            System.out.println("Sum of input is : "+ sum);

    }
}
