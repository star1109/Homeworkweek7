package homeworkweek7;

import java.util.Scanner;

public class Program8
{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Scanner obj = new Scanner(System.in);
        char alpha;//declare char variable

        System.out.println("PLease enter an alphabet between A to F: ");
        alpha = obj.next().charAt(0);//user input..it will consider first character if input string
        char beta = Character.toUpperCase(alpha);//to make it uppercase
//choose city name as per input by using if..else
        if (beta == 'A') {
            System.out.println("Anand");
        } else if (beta == 'B') {
            System.out.println("Baroda");
        } else if (beta == 'C') {
            System.out.println("Chicago");
        } else if (beta == 'D') {
            System.out.println("Dahod");
        } else if (beta == 'E') {
            System.out.println("Epson");
        } else if (beta == 'F') {
            System.out.println("Florida");
        } else {
            System.out.println("Invalid entry");
        }


    }


}
