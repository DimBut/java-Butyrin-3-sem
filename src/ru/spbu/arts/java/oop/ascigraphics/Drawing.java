package ru.spbu.arts.java.oop.ascigraphics;

public class Drawing {
    char [][] k;

    Drawing(int a, int b, char f){
        this.k = new char[a][b];
        for (int i = 0; i < a; i++){
            for (int j = 0; j < b; j++)
                k[i][j] = f;
        }
    }

    public void print(){
        for (int i = 0; i < k.length; i++) {
            for (int j = 0; j < k[0].length; j++) {
                System.out.print(k[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public void setPoint(int x, int y, char l){
        k[x-1][y-1] = l;
    }

    public void drawVerticalLine(int x, int y, int z, char l){ //x - номер столбца, y - номер первой строки, z - номер последней
        for (int i = y-1; i < z; i++) {
            k[i][x-1] = l;
        }
    }

    public void drawHorizontalLine(int x, int y, int z, char l){ //x - номер строки, y - номер первого столбца, z - номер последнего
        for (int j = y-1; j < z; j++) {
            k[x-1][j] = l;
        }
    }
    public void drawRectangle(int x1, int y1, int x2, int y2, char l){
        drawHorizontalLine(x1, y1, y2, l);
        drawHorizontalLine(x2, y1, y2, l);
        drawVerticalLine(y1, x1, x2, l);
        drawVerticalLine(y2, x1, x2, l);
    }
}