import java.util.Arrays;

public class RationalOparetion {

    /**
     * @param args
     */
    public static void main(String[] args) {
        double arr[] = {1, 595, 6.25, 35.654, 10, -95, -42.35, -565, 0};
        Arrays.sort(arr);
        System.out.println("Sorted value is " + arr);
        
        // getting indivisual value 
        int i;
        for(i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // max value 
        double max = arr[0];
        for(i = 1; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("The max value is " + max);
        
        // min value 
        double min = arr[0];
        for(i = 1; i < arr.length; i++) {
            if(min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("The min value is " + min);
    }
}