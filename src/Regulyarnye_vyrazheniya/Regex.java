package Regulyarnye_vyrazheniya;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        String m = "m-A_le@mail.ru";
        System.out.println(emails(m));
        String k = "Сегодня, ровно в 23:15 я пошел в магазин, так как в 11:10 забыл купить молоко, 25:47";
        vremya(k);
        String l = "Это строка , у которой зачем-то написаны два пробела перед запятой";
        l = probely(l);
        System.out.println(l);
        m = "Какая-то сине-зеленоватая трава растет у меня из-за химикатов 0-9 Same-way";
        System.out.println(perestanovka(m));
        String n = "Кот пошел в кино кот кОт КОТ снова здесь КоТ";
        System.out.println(Chisloupomin(n));


    }

    private static boolean emails(String m) {
        boolean k = m.matches("[A-Za-z0-9\\-\\_]*+@[A-Za-z0-9\\-\\_]*+.[a-z]*");
        return k;
    }

    private static void vremya(String k) {
        String pattern = "(\\d\\d):(\\d\\d)";
        Pattern l = Pattern.compile(pattern);
        Matcher m = l.matcher(k);
        while (m.find()) {
            if ((Integer.valueOf(m.group(1)) < 24) && (Integer.valueOf(m.group(2)) < 60)) {
                System.out.println(m.group(0) + " - vremya pravilnoe");
            } else System.out.println(m.group(0) + " - vremya nepravilnoe");
        }
    }

    private static String probely(String k) {
        String text = k.replaceAll("\\s*,", ",");
        return text;
    }

    private static String perestanovka(String k) {
        String text = k.replaceAll("([^\\s]*)-([^\\s]*)", "$2-$1");
        return text;
    }

    private static int Chisloupomin(String k) {
        int n = 0;
        String pattern = "(К|к|)(О|о)(Т|т)";
        Pattern l = Pattern.compile(pattern);
        Matcher m = l.matcher(k);
        while (m.find())
            n = n + 1;
    return n;
    }

}
