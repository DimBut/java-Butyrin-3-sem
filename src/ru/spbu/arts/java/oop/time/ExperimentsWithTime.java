package ru.spbu.arts.java.oop.time;

public class ExperimentsWithTime {
    public static void main(String[] args){
        Time First = new Time(7, 15);
        Time Second = new Time(17, 45);
        Time Third = new Time(0, 0);
        Time Fourth = new Time(12, 55);
        System.out.println(First.show());
        System.out.println(Second.show());
        First.is_day();
        Fourth.is_day();
        Third.is_morning();
        First.is_morning();
        Fourth.is_evening();
        Second.is_evening();
        First.is_night();
        System.out.println(First.sayHello());
        System.out.println(Second.sayHello());
        System.out.println(Third.sayHello());
        System.out.println(Fourth.sayHello());
        First.add(50);
        Second.add(33);
        Third.add(54);
        Fourth.add(5);

    }
}
