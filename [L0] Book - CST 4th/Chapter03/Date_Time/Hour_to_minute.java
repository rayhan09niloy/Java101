package Date_Time;

import java.util.Scanner;

public class Hour_to_minute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of hours:  ");
        int hour = sc.nextInt();
        
        int minute = hour * 60; 

        int sec = minute * 60;

        System.out.println("The total is " + minute + " minute.");
        System.out.println("The total is " + sec + " second");
        
        sc.close();
    }    
}
