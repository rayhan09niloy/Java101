// package statement
package Program_for_areas;

// import statement 
import java.util.Scanner;

// program 
public class areaOfRombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the diagnal01? ");
        int diagnal01 = sc.nextInt();
        
        System.out.println("Enter the diagnal02? ");
        int diagnal02 = sc.nextInt();

        double areaOfRombus = 0.5 * diagnal01 * diagnal02; 

        System.out.println("The area of circle is " + areaOfRombus);
        
        sc.close();
    }
}
