
// package statement
package Date_Time;

// import statement 
import java.util.Scanner;

// program 
public class Month_to_Day {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter how many month:  ");
        int month = sc.nextInt();
        
        int day = month * 30; 

        System.out.println("Total day is " + day);
        
        sc.close();
    }
}
