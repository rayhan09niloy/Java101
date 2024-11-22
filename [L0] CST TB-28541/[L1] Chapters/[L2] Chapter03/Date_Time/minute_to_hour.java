package Date_Time;

import java.util.Scanner;

public class minute_to_hour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter how many minutes: ");
        int minutes = sc.nextInt();
        
        int hour = minutes / 60;

        int remaining_minute = minutes - (hour  * 60);

        System.out.println("Total hour is " + hour + " hours and " + remaining_minute + " minutes");
        
        sc.close();
    }
}
