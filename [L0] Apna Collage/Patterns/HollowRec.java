package Patterns;
public class HollowRec {
    public static void main(String [] args) {
        
        int w  = 5;
        int h = 4;
        
        for(int i = 1; i <= h; i++) {
            
            for (int j = 1; j <= w; j++) {
                
                if(i == 1 || j == 1 || i == h || j == w) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
                
            }
            
            System.out.println();
        }
    }
}