package matrix;
import java.util.Arrays;

public class Matrix22tester {
    public static void main(String[] args) {
        var a = new Matrix22(1, 2, 3, 4);
        var b = new Matrix22(new int[][]{{1, 2}, {3, 4}});
        a.sled_diskr();
        System.out.println(Arrays.deepToString(b.getMassiv()));
        System.out.println(a.toString());
        b.print();
        a.add(b).print();
        a.mul(b).print();
        a.pow(4).print();

    }

}
