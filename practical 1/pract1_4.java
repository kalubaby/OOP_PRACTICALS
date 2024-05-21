import java.util.Scanner;
class pract1_4{

 public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  System.out.print("enter value in meters :");
  double meter = input.nextDouble();
  double feet = meter * 3.28084;
  System.out.print(meter+ "Meters =" + feet+ "Feets");
  }
}