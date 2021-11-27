public class PrimalityTest {
    public static void main(String[] args) {

        int a = 147;
        boolean f = true;
        for (int i = 2; i <= Math.sqrt(a); i = i + 1) {
            if (a % i == 0)
                f = false;
            }
        if (a < 2)
            f = false;
        if (f) System.out.println(a + " - простое");
        else System.out.println(a + " - не простое");
    }
}
