package Massivy;


public class MultidimentionalArrays {
    public static void main(String[] args) {
        int[][] a = new int[][]{
                {10, 20, 30, 54, 66, 76, 98},
                {40, 50, 60, 70, 80, 90},
                {100, 200}
        };
        printTable(a);

    }

    private static void printTable(int a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length - 1; j++)
                System.out.print(a[i][j] + " ");
            System.out.println(a[i][a[i].length-1]);
        }
    }





}