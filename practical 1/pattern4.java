public class pattern4 {
   
    public static void main(String[] args) {
        // Pyramid
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Inverted pyramid
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }  
    }
}