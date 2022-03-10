package ru.spbu.arts.java.oop.rational;

public class RationalTest {
    public static void main(String[] args){
        Rational a = new Rational(1, 3);
        System.out.println(a.toString());
        System.out.println(a.toDouble());
        Rational r3 = new Rational(1,6);
        System.out.println(a.add(r3));
        System.out.println(a.sub(r3));
        System.out.println(a.div(r3));
        System.out.println(a.mul(r3));
        a.addInPlace(r3);
        System.out.println(a);
        System.out.println(f(2));
        System.out.println(f(3));
        System.out.println(f(20));
    }

    public static double f(int n){
        int k = 1;
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum +  1./k;
            k = k+1;
        }
        return sum;
    }






}
