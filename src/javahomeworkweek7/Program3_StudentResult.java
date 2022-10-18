//Created by Manisha Mavani
/*3. Write a java program to input student Name, roll No, and three subjects Math, Science and English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid Input, Marks should between 0 to 100”) and find out total, percentage and result.
If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+, %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 _______________________________
|                               |
|          Mark Sheet           |
|_______________________________|
|      Name    : Jay            |
|      Roll No : 08             |
|_______________________________|
|      Subjects : Marks         |
|_______________________________|
|        Math    : 98           |
|        Science : 90           |
|        English : 85           |
|_______________________________|
|        Total : 273            |
|_______________________________|
|      Percentage : 91.0        |
|      Result     : Pass        |
|      Grade      : A+          |
|_______________________________|
 */
package javahomeworkweek7;

import java.util.Scanner;

public class Program3_StudentResult {
    public static void main(String[] args) {
        studentMarkSheet();
    }

    public static void studentMarkSheet() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Student Name :");
        String studentName = scanner.nextLine();
        System.out.print("Enter Student Roll Number : ");
        int rollNumber = scanner.nextInt();
        System.out.println("Enter Math Subject's Marks");
        int mathMarks = scanner.nextInt();
        System.out.println("Enter Science Subject's Marks");
        int scienceMarks = scanner.nextInt();
        System.out.println("Enter English's Marks");
        int englishMarks = scanner.nextInt();
        int total = mathMarks+scienceMarks+englishMarks;
        System.out.println(" _______________________________");
        System.out.println("|          Mark Sheet           |");
        System.out.println("|_______________________________|");
        System.out.println("|      Name    : "+studentName+"           |");
        System.out.println("|      Roll No : "+rollNumber+"              |");
        System.out.println("|_______________________________|");
        System.out.println("|      Subjects : Marks         |");
        System.out.println("|_______________________________|");
        System.out.println("|        Math    : "+mathMarks+"           |");
        System.out.println("|        Science : "+scienceMarks+"           |");
        System.out.println("|        English : "+englishMarks+"           |");
        if(mathMarks<0 || mathMarks>100 || scienceMarks<0 || scienceMarks>100 || englishMarks<0 || englishMarks>100){
            System.out.println("Invalid marks");
            System.exit(0);
        }
        System.out.println("|_______________________________|");
        System.out.println("|        Total : "+total+"            |");
        System.out.println("|_______________________________|");
        float percentage = (total*100)/300;
        System.out.println("|      Percentage : "+percentage+"        |");

        if(percentage>=80){

            System.out.println("|      Result     : Pass        |");
            System.out.println("|      Grade      : A+          |");
        } else if (percentage>= 60) {
            System.out.println("|      Result     : Pass        |");
            System.out.println("|      Grade      : A           |");
        } else if (percentage>=50) {
            System.out.println("|      Result     : Pass        |");
            System.out.println("|      Grade      : B           |");
        } else if (percentage>=35) {
            System.out.println("|      Result     : Pass        |");
            System.out.println("|      Grade      : C           |");
        }else{
            System.out.println("|      Result     : Fail        |");
            System.out.println("|      Grade      : F           |");

        }
        System.out.println("|_______________________________|");
    }
}
