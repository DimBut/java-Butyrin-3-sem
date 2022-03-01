package ru.spbu.arts.java.oop.time;

public class Time {
    int hour;
    int minute;

    Time(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    public String show(){
        String a = this.hour + ":" + this.minute;
        return a;
    }

    public void is_day() {
            if ((this.hour >= 12) && (this.hour < 18))
                System.out.println("Сейчас день");
            else
                System.out.println(("Сейчас не день"));
            return;
    }
    public void is_morning() {
        if ((this.hour >= 5) && (this.hour < 12))
            System.out.println("Сейчас утро");
        else
            System.out.println(("Сейчас не утро"));
        return;
    }

    public void is_evening() {
        if ((this.hour >= 18) && (this.hour <= 23))
            System.out.println("Сейчас вечер");
        else
            System.out.println(("Сейчас не вечер"));
        return;
    }
    public void is_night() {
        if ((this.hour >= 0) && (this.hour < 5))
            System.out.println("Сейчас ночь");
        else
            System.out.println(("Сейчас не ночь"));
        return;
    }

    public String sayHello() {
        String a = "";
        if ((this.hour >= 0) && (this.hour < 5))
            a = "Доброй ночи";
        else if ((this.hour >=5) && (this.hour <12))
            a = "Доброе утро";
        else if ((this.hour >=12) && (this.hour <18))
            a = "Добрый день";
        else if ((this.hour >=18) && (this.hour <=23))
            a = "Добрый вечер";
        return a;
    }
    public void add(int min) {
        this.hour = ((this.hour) + (this.minute + min) / 60) % 24;
        this.minute = (this.minute + min) % 60;
        System.out.println(this.hour + ":" + this.minute);
        return;
    }




}
