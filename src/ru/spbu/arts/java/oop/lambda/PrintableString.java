package ru.spbu.arts.java.oop.lambda;

public class PrintableString implements Printable {
    String x;

    PrintableString(String x){
        this.x = x;
    }

    public void print(){
        System.out.println(this.x);
    }
}
