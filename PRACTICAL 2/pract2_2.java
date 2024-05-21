public class pract2_2 {
    public static int pr2__2(int a[][]) {
        int min = a[0][0];
        int i, j;
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a.length; j++) {
                if (a[i][j] < min) {
                    min = a[i][j];
                }
            }
        }
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a.length; j++) {
                if (a[i][j] == min) {
                    System.out.println("minimum value index:" + i + " ," + j);
                }
            }
        }
        return min;
    }

    public static void main(String args[]) {
        int arr[][] = { { 9, 2 }, { 4, 5 } };
        System.out.println("minumum element of arr:" + pr2__2(arr));
    }
}