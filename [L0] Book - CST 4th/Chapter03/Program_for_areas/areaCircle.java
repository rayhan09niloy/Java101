// package statement
package Program_for_areas;

// import statement 
import java.util.Scanner;

// program 
public class areaCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius? ");
        int radius = sc.nextInt();
        
        double areaOfcircle = Math.PI * radius * radius; 

        System.out.println("The area of circle is " + areaOfcircle);
        
        sc.close();
    }
}
