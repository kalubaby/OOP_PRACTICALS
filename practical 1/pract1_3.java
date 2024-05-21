import java.util.Scanner;
class pract1_3{

public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.println("values from equestion -1 :");
System.out.print("enter value of a :");
double a = input.nextDouble();
System.out.print("enter value of b :");
double b = input.nextDouble();
System.out.print("enter value of e :");
double e = input.nextDouble();

System.out.println("values from equestion -2 :");
System.out.print("enter value of c :");
double c = input.nextDouble();
System.out.print("enter value of d :");
double d = input.nextDouble();
System.out.print("enter value of f :");
double f = input.nextDouble();

double s = ((e*d)-(b*f))/((a*d)-(b*c));
double t = ((a*f)-(e*c))/((a*d)-(b*c));

System.out.println("X =" + s );
System.out.println("Y =" + t);
}

}



