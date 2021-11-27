public class IntroTaskCat {
    public static void main(String[] args) {

        int a = 102;
        if ((a%10 > 4) || (a %10 == 0) || ((a % 100 >10)&&(a%100 < 15)))
            System.out.println(a + " котов");
        else if ((a % 10 == 1) && (a % 100 != 11))
            System.out.println(a + " кот");
        else if ((a%10 > 1) || (a %10 < 5))
            System.out.println(a + " кота");
    }
}
