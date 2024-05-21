import java.util.Scanner;
class pract1_7 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter Character : ");
    char ch = input.next().charAt(0);
    switch (Character.toLowerCase(ch)) {
    case 'a':
    case 'e':
    case 'i':
    case 'o':
    case 'u':
      System.out.print(ch + " is vowel");
      break;
    default:
      System.out.print(ch + " is constant");
    }
  }
}