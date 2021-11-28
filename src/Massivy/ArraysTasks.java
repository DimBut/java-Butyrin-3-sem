package Massivy;
import java.util.Arrays;

public class ArraysTasks {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(even(15)));
        int[] a = new int[]{10, 20, 30, 40};
        System.out.println(allSimilar(a));
        System.out.println(hasSimilar(a));
        System.out.println(mean(a));
        shift(a);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(copyShift((a))));



    }

    private static int[] even(int n) {
        int a = n;
        int[] b = new int[a];
        for (int i = 0; i < b.length; i++)
            b[i] = 2*(i+1);
       return(b);
    }
    private static boolean allSimilar(int[] a) {
        int x = a[0];
        boolean f = true;
        for (int i = 1; i < a.length; i++)
            if (x != a[i])
                f = false;
        return f;
    }

    private static boolean hasSimilar(int[] a){
        boolean f = false;
        for (int i = 0; i < (a.length)-1; i++)
            for (int j = 1; j < (a.length); j++)
                if (a[i] == a[j])
                    f = true;
        return f;
    }

    private static double mean(int[] a){
        int n = a.length;
        int sum = 0;
        for (int i = 0; i < a.length; i++)
            sum = sum + a[i];
        float k = sum/n;
        return k;
    }

    private static void shift(int[] a){
        int d = a[(a.length)-1];
        for (int i = a.length-1; i > 0; i--)
            a[i] = a[i-1];
        a[0]=d;
    }

    private static int[] copyShift(int[] a){
        int[] b = new int[a.length];
        for (int i = 0; i < a.length-1; i++)
            b[i+1] = a[i];
        b[0]=a[a.length-1];
        return b;
    }

}
