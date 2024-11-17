import java.util.Scanner;

public class dBY3 {
    public static void main (String[] args) {
        //config utilities
        Scanner sc = new Scanner(System.in);
        
        //dynamic approch, by taking an input
        System.out.println("\nEnter a number: ");
        int num = sc.nextInt();

        // call the validator function
        int digit = validator(num);

        // check if the number is devided by 3 or not
        if(digit % 3 == 0) 
        {
            System.out.println("The number " + num + " is devided by 3");
        } else {
            System.out.println("The number " + num + " is not devided by 3");
        }

        sc.close();
    }

    // Function to validate the number
    public static int validator(int num)
    {
        while (num > 9) {
            num = combineSum(num);
        }
        return num;
    }

    // Function to combine the sum of the digits
    public static int combineSum(int num)
    {
        int sum = 0; 
        while (num != 0) {
            sum += num % 10; //Extract last digit from num & add the last digit to the sum
            num /= 10; //Remove the last digit, which is a fraction
        }
        return sum;

    }
}
