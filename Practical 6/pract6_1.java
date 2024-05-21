Import java.util.*;
class DivideZero extends Exception
{
    DivideZero(String msg)
    {
        System.out.println(msg);
    }
}
class pract6_1
{
    public static void main(String args[]) throws DivideZero
    {
            div(10,0);
    }
    public static void div(int a, int b) throws DivideZero
    {
        if(b==0)
        {
            throw new DivideZero("any number to not  divide by zero");
        }
        else
        {
            int c = a / b;
            System.out.println("your answer is : " +c);
        }
    }
}

