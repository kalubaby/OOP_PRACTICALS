public class pract2_3 
 {
     public static int removeduplicates(int a[], int n)
      {
        if (n == 0 || n == 1) 
           {return n;}

        int[] temp = new int[n];
        int j = 0;

        for (int i = 0; i < n - 1; i++) 
        {
          if (a[i] != a[i + 1]) 
              temp[j++] = a[i];
        }
        
        temp[j++] = a[n - 1];

        for (int i = 0; i < j; i++) 
        {
          a[i] = temp[i];
        }

        return j;
    }
    public static void main(String[] args)
    {
        int a[] = { 1, 1, 2, 2, 2, 8, 7, 123 };
        int n = a.length;

        System.out.println("before removing all duplicates");
        for (int i = 0; i < n; i++)
           {
            System.out.print( a[i] + " ");
           }
        System.out.println(" ");
        n = removeduplicates(a, n);
        
        System.out.println("after removing all duplicates");
        for (int i = 0; i < n; i++)
           {
            System.out.print( a[i] + " ");
           }
    }
}