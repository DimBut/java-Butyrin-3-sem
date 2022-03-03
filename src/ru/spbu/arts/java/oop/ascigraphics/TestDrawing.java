package ru.spbu.arts.java.oop.ascigraphics;

public class TestDrawing {
    public static void main(String[] args){
        Drawing a = new Drawing(5, 6, '.');
        Drawing b = new Drawing(8, 9, '.');
        a.print();
        a.setPoint(1,4,'#');
        a.print();
        a.drawVerticalLine(1, 2,3,'|');
        a.print();
        a.drawHorizontalLine(4, 1, 5, '-');
        a.print();
        b.drawRectangle(1,1, 4,5, '%');
        b.print();

    }
}
