package Date_Time;

import java.util.Scanner;

public class Sec_to_Hour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of seconds:  ");
        int sec = sc.nextInt();
        
        int minute = sec / 60; 
        int remaining_sec = sec - (minute * 30);

        int hour = minute / 60;
        int remaining_minute = minute - (hour * 60);

        System.out.println("The above is total estimated " + hour + " hour(s), " + minute + " minute(s) and " + sec + " second(s)");
        System.out.println("The remaining is " + remaining_minute + " minute(s) and " + remaining_sec + " second(s) ");
        
        sc.close();
    } 
}
