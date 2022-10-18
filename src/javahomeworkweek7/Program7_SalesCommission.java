//Created By Manisha Mavani
/*7. Write a java program input sales id, seller's name, sales amount, and salary basic and then find this
sales Commission
Sales amount >= 50,000 35%
Sales amount >= 30,000 20%
 >= 20,000 10%
 >= 10,000 5%
 < 10,000 2%
*/
package javahomeworkweek7;


import java.util.Scanner;

public class Program7_SalesCommission {
    public static void main(String[] args) {
        salesCommission();
    }
    public static void salesCommission(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter seller's name : ");
        String sellerName = scanner.nextLine();
        System.out.print("Enter sales ID : ");
        int salesId = scanner.nextInt();
        System.out.print("Enter sales Amount : ");
        int salesAmount = scanner.nextInt();
        System.out.print("Enter basic Salary : ");
        int basicSalary = scanner.nextInt();
        if(salesAmount>=50000){
            System.out.println("Sales commission is = "+(salesAmount*35)/100);
        } else if (salesAmount>=30000) {
            System.out.println("Sales commission is = "+(salesAmount*20)/100);
        }else if (salesAmount>=20000) {
            System.out.println("Sales commission is = "+(salesAmount*10)/100);
        }else if (salesAmount>=10000) {
            System.out.println("Sales commission is = "+(salesAmount*5)/100);
        }else{
            System.out.println("Sales commission is = "+(salesAmount*2)/100);
        }
    }
}
