// Given an input date dd/mm/yyyy format, write a program to identify and print the equilant day of that date. sample input 06 06 1999 , sample output sunday

package JavaTraining;
import java.util.Scanner;
class Day{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Date: ");
        int date = sc.nextInt();
        System.out.print("Month: ");
        int month = sc.nextInt();
        System.out.print("Year: ");
        int year = sc.nextInt(); 

        int yearCent = year%100;
        int cent = year/100;
        int day = (date + ((13*(month+1))/5 ) + yearCent +(yearCent/4)+(cent/4)+(5*cent))%7;     
        day = 123456%7;
        System.out.println(day);
        
        switch (day){
            case 0:
                System.out.println("Saturday");
                break;
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Enter a Valid Input");
                break;
        }
        

    }
}