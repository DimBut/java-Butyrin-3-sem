public class IntroTaskLeap {
    public static void main(String[] args) {

        int year = 1585;
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
            System.out.println("God " + year + " visokosniy");
        else System.out.println("God " + year + " ne visokosniy");
    }

}
