//Created By Manisha Mavani
/*5. WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross salary
HRA = basic salary 10%
DA = Basic salary 8%
TA = Basic salary 9%
PF= Basic salary 20%
Gross salary = basic salary + HRA + TA + DA –PF
Print in following format
_______________________________
|        Salary Slip           |
|______________________________|
|Employee Id   : 2564          |
|Employee Name : Jay           |
|______________________________|
|Basic Salary  : 25000.0       |
|HRA 10%       : 2500.0        |
|TA 8%         : 2250.0        |
|DA 9%         : 2000.0        |
|PF - 20%      : 5000.0        |
|______________________________|
|Gross Salary : 26750.0        |
|==============================|

 */
package javahomeworkweek7;

import java.util.Scanner;

public class Program5_EmployeePayslip {
    public static void main(String[] args) {
        payslip();
    }

    public static void payslip(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Employee name :");
        String empName = scanner.nextLine();
        System.out.print("Enter Employee ID :");
        int empID = scanner.nextInt();
        System.out.print("Enter Employee Basic Salary : ");
        float basicSalary = scanner.nextFloat();
        float salaryHRA = (basicSalary*10)/100;
        float salaryTA = (basicSalary*8)/100;
        float salaryDA = (basicSalary*9)/100;
        float PF = (basicSalary*20)/100;
        float grossSalary = basicSalary+salaryHRA+salaryDA+salaryTA-PF;
        System.out.println("_______________________________");
        System.out.println("|        Salary Slip           |");
        System.out.println("|______________________________|");
        System.out.println("|Employee Id   : "+empID+"          |");
        System.out.println("|Employee Name : "+empName+"           |");
        System.out.println("|______________________________|");
        System.out.println("|Basic Salary  : "+basicSalary+"       |");
        System.out.println("|HRA 10%       : "+salaryHRA+"        |");
        System.out.println("|TA 8%         : "+salaryTA+"        |");
        System.out.println("|DA 9%         : "+salaryDA+"        |");
        System.out.println("|PF - 20%      : "+PF+"        |");
        System.out.println("|______________________________|");
        System.out.println("|Gross Salary : "+grossSalary+"        |");
        System.out.println("|==============================|");
    }

}
