package ru.spbu.arts.java.oop.rational;

public class Rational {
    private int n;
    private int d;

    Rational(int n, int d) {
        int a = this.nod(n, d);
        this.n = n/a;
        this.d = d/a;
    }

    Rational(int n){
        this.n=n;
        this.d=1;
    }

    public String toString(){
        if (this.n == 0) {
            return "0";
        }
        else if (this.d == 1) {
            return Integer.toString(this.n);
        }
        else if (this.d == 0) {
            return "Дробь не существует";
        }
        else
            return (this.n + "/" + this.d);
    }

    public double toDouble(){
        double a = this.n/this.d;
        return a;
    }

    public static int nod(int a, int b) {
        if (a == 0)
            return b;
        while (b != 0) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        return a;
    }

    public Rational add(Rational a){
        int r = this.n * a.d + a.n * this.d;
        int k = this.d * a.d;
        Rational m = new Rational(r, k);
        return m;
    }

    public Rational addInPlace(Rational a){
        this.n = this.n * a.d + a.n * this.d;
        this.d = this.d * a.d;
        int k = this.nod(n, d);
        this.n = this.n/k;
        this.d = this.d/k;
        return this;
    }

    public Rational sub(Rational a){
        int r = this.n * a.d - a.n * this.d;
        int k = this.d * a.d;
        Rational m = new Rational(r, k);
        return m;
    }

    public Rational subInPlace(Rational a){
        this.n = this.n * a.d - a.n * this.d;
        this.d = this.d * a.d;
        int k = this.nod(n, d);
        this.n = this.n/k;
        this.d = this.d/k;
        return this;
    }

    public Rational mul(Rational a){
        int r = this.n *  a.n;
        int k = this.d * a.d;
        Rational m = new Rational(r, k);
        return m;
    }

    public Rational mulInPlace(Rational a){
        this.n = this.n *  a.n;
        this.d = this.d * a.d;
        int k = this.nod(n, d);
        this.n = this.n/k;
        this.d = this.d/k;
        return this;
    }

    public Rational div(Rational a){
        int r = this.n * a.d;
        int k = this.d * a.n;
        Rational m = new Rational(r, k);
        return m;
    }

    public Rational divInPlace(Rational a){
        this.n = this.n * a.d;
        this.d = this.d * a.n;
        int k = this.nod(n, d);
        this.n = this.n/k;
        this.d = this.d/k;
        return this;
    }

    public int getN(){
        return this.n;
    }

    public int getD(){
        return this.d;
    }
    static final Rational ZERO = new Rational (0);
    static final Rational ONE = new Rational (1);

}
