//Created By Manisha Mavani
package javahomeworkweek7;
//Write a Java program to sort a numeric array and a string array.
import java.util.Arrays;

public class Program17_SortArray {
    public static void main(String[] args) {
        sortingArrayValues();
    }
    public static void sortingArrayValues(){
        int[] num = {45,56,34,87,10,30,67,54};
        String[] name = {"Manisha", "Krupa", "Siddhi","Nauman","Harshid","Kishan","Hiren"};

        System.out.println("Original number value is : "+ Arrays.toString(num));
        Arrays.sort(num);
        System.out.println("Sorted  number value is : "+ Arrays.toString(num));
        System.out.println("Original string value is : "+Arrays.toString(name));
        Arrays.sort(name);
        System.out.println("Sorted string value is : "+Arrays.toString(name));

    }
}
