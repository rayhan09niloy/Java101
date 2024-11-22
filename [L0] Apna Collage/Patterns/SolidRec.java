package Patterns;

public class SolidRec {
    public static void main(String [] args) {
        
        int w  = 5;
        int h = 4;
        
        for(int i = 1; i <= h; i++) {
            
            for (int j = 1; j <= w; j++) {
                
                System.out.print("*");
                
            }
            
            System.out.println();
        }
        
        
    }
}