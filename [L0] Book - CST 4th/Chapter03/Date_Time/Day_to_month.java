package Date_Time;

import java.util.Scanner;

public class Day_to_month {    
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter how many days:  ");
        int days = sc.nextInt();
        
        int month = days / 30;

        int remaining_days = days - (month * 30);

        if(remaining_days == 0) {
            System.out.println("The total is " + month + " months");
        } else if (month == 0) {
            System.out.println("The total is " + remaining_days + " remaining days");
        } else {
            System.out.println("The total is " + month + " months and "+ remaining_days + " remaining days");
        }
            
        
        sc.close();
    }

   
}
