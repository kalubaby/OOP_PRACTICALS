import java.io.IOException;

public class pract6_2 {

    static void methodWithThrow() {
        try {
            throw new NullPointerException("This is a NullPointerException");
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }

    static void methodWithThrows() throws IOException {
        throw new IOException("This is an IOException");
    }

    public static void main(String[] args) {
        try {
            try {
                methodWithThrow();
            } catch (NullPointerException e) {
                System.out.println("Caught NullPointerException again in main: " + e.getMessage());
            }

            try {
                methodWithThrows();
            } catch (IOException e) {
                System.out.println("Caught IOException in main: " + e.getMessage());
            }

            try {
                try {
                    int[] arr = new int[3];
                    System.out.println(arr[4]);
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
                }

                try {
                    int result = 10 / 0;
                } catch (ArithmeticException e) {
                    System.out.println("Caught ArithmeticException: " + e.getMessage());
                }
            } catch (Exception e) {
                System.out.println("Caught exception in nested try-catch block: " + e.getMessage());
            }
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}
