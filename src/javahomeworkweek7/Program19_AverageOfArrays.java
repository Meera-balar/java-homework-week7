//Created By Manisha Mavani
package javahomeworkweek7;
//Write a Java program to calculate the average value of array elements.
import java.util.Arrays;

public class Program19_AverageOfArrays {
    public static void main(String[] args) {
        averageOfArrays();
    }

    public static void averageOfArrays() {
        //create an array
        int[] a = {1,2,3,4,5,6,7,8,9};
        System.out.println("Array is " + Arrays.toString(a));
        //default sum is 0
        int sum = 0;
        //getting array length
        int length = a.length;

        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        double average = sum/length;
        System.out.println("Average of array : " +average);
    }
}
