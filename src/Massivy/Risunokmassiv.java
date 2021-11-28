package Massivy;

import java.util.Arrays;

public class Risunokmassiv {
    public static void main(String[] args) {
        char[][] c = createTable(20, '.');
        printTable(c);

        System.out.println("============ Заполним строки: ==========");
        fillFirstAndLastLines(c, '#');
        printTable(c);

        System.out.println("============ Заполним столбцы: =========");
        fillFirstAndLastColumns(c, '#');
        printTable(c);
    }

    private static char[][] createTable(int n, char k) {
        char[][] a = new char[n][n];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[i].length; j++)
                a[i][j] = k;
        return a;
    }

    private static void printTable(char[][] c){
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length - 1; j++)
                System.out.print(c[i][j] + " ");
            System.out.println(c[i][c[i].length-1]);
        }
    }
    private static void fillFirstAndLastLines(char[][] a, char x){
        Arrays.fill(a[0], x);
        Arrays.fill(a[a.length-1], x);
    }
    private static void fillFirstAndLastColumns(char[][] a, char x) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if ((j == 0) || (j == a.length-1))
                    a[i][j] = x;

            }
        }


    }
}
