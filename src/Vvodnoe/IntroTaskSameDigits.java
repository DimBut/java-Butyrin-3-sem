public class IntroTaskSameDigits {

    public static void main(String[] args) {

        int a = 145566;
        if ((a % 10) == ((a/10) % 10))
            System.out.println("poslednie cifry sovpadaut");
        else System.out.println("poslednie cifry ne sovpadaut");
    }
}
