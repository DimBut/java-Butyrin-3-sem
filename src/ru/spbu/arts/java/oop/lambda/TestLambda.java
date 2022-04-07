package ru.spbu.arts.java.oop.lambda;

public class TestLambda {
    public static void main(String[] args) {
        PrintableLetter pl = new PrintableLetter("x", 10);
        pl.print();

        PrintableString ps = new PrintableString("asdf");
        ps.print();

    }
}
