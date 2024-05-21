public class pract3_1 {
    public static void main(String[] args) {
        System.out.println("Number of arguments = " + args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.println((i + 1) + ": " + (i == 0? "First" : i == 1? "Second" : "Third") + " Student Name is =" + args[i]);
        }
    }
}