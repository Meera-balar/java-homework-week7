//Created By Manisha Mavani
package javahomeworkweek7;
//Write a java program to print the numbers between 1 to 100 which can be divided by 3 and 5 separately.
public class Program11_NumberDivision {
    public static void main(String[] args) {

        arrayDivision();
    }

    public static void arrayDivision(){
        System.out.println("\n Numbers Divided by 3 is as below :");
        for (int i = 1; i<=100; i++){
            if(i % 3 == 0)
                System.out.print(i + " , ");
        }
        System.out.println("\n  Numbers Divided by 5 is as below :");
        for (int i = 1; i<=100; i++){
            if(i % 5 == 0)
                System.out.print(i + " , ");
        }
    }
}
