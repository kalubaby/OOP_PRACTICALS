 class PalindromeChecker {

    // Method to reverse a string
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }

    // Method to check if a string is palindrome
    public static boolean isPalindrome(String str) {
        String reversed = reverseString(str);
        return str.equalsIgnoreCase(reversed);
    }

    public static void pract4_1(String[] args) {
        // Checking if 5 words are provided as command-line arguments
        if (args.length != 5) {
            System.out.println("Please provide 5 words as command-line arguments.");
            return;
        }

        // Iterating over each word, reversing it, and checking if it's palindrome
        for (String word : args) {
            String reversedWord = reverseString(word);
            boolean palindrome = isPalindrome(word);
            System.out.println("Word: " + word);
            System.out.println("Reversed: " + reversedWord);
            System.out.println("Palindrome: " + palindrome);
            System.out.println();
        }
    }
}
