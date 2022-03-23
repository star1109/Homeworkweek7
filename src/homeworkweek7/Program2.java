package homeworkweek7;

import java.util.Scanner;

public class Program2
{
    public static void main(String[] args) {
        Scanner scanner = new  Scanner(System.in) ;

        System.out.println("Enter Year: ");
        int year = scanner.nextInt();


        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
        {
            System.out.println(year +" is a leap year");
        }
        else
            System.out.println(year + " is not a leap year");

    }


}
