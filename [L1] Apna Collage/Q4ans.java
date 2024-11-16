// Your math teacher asked you to calculate the sum of the numbers 1 to N,
// where N is a given number.

// Task: Take an integer N from input and output the sum of the numbers 1 to N(inclusive)

// Sample Input: 10
// Sample Output: 55


import  java.util.Scanner;

public class Q4ans {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;
        int i = 1;
        
        do {
            sum += i;
            i++;
        } while(i <= n);
        
        System.out.println(sum);

        sc.close();
    }

}