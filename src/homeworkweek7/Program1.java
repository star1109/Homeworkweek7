package homeworkweek7;

import java.util.Scanner;

public class Program1
{

    public static void main(String[] args)
   {
       Scanner sc = new  Scanner(System.in) ;

        System.out.println("Enter number: ");
      int num = sc.nextInt();

        /*if(num%2==0)  //-- using if condition
        {
            System.out.println(num + " is a even number");
        }
        else
        {
            System.out.println(num + " is a odd number");
        }*/

        // using ternary operator
        String result = (num%2==0) ? "Even " : "Odd ";
        System.out.println(num + " is a "+result + "number");




    }

}
