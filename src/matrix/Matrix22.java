package matrix;
import java.util.Arrays;

public class Matrix22 {
    int n11;
    int n12;
    int n21;
    int n22;

    Matrix22(int n11, int n12, int n21, int n22) {
        this.n11 = n11;
        this.n12 = n12;
        this.n21 = n21;
        this.n22 = n22;
    }

    Matrix22(int[][] a){
        this.n11 = a[0][0];
        this.n12 = a[0][1];
        this.n21 = a[1][0];
        this.n22 = a[1][1];
    }


    public void sled_diskr () {
        int sled = this.n11 + this.n22;
        int diskr = (this.n11 * this.n22) - (this.n12 * this.n21);
        System.out.println(sled);
        System.out.println(diskr);
    }

    public int[][] getMassiv(){
        return new int[][]{{n11, n12}, {n21, n22}};
    }


    public String toString(){
        String c = "";
        c = c + n11 + " " + n12 + " " + n21 + " "+ n22;
        return c;


   }
    public void print(){
        System.out.println(this.n11 + " " + this.n12);
        System.out.println(this.n21 + " " + this.n22);
    }

    public Matrix22 add(Matrix22 b) {
        Matrix22 c = new Matrix22(this.n11+b.n11, this.n12+b.n12, this.n21+b.n21, this.n22+b.n22);
        return c;
    }

    public Matrix22 mul(Matrix22 b) {
        Matrix22 c = new Matrix22(this.n11*b.n11+this.n12*b.n21, this.n11*b.n12+this.n12*b.n22, this.n21*b.n11+this.n22*b.n21, this.n21*b.n12 + this.n22*b.n22);
        return c;
    }

    public Matrix22 pow(int n){
        Matrix22 c = new Matrix22(this.n11, this.n12, this.n21, this.n22);
        for (int i=0; i<n-1; i++){
            int a = c.n11*this.n11+c.n12*this.n21;
            int b = c.n11*this.n12+c.n12*this.n22;
            int d = c.n21*this.n11+c.n22*this.n21;
            int k = c.n21*this.n12 + c.n22*this.n22;
            c.n11 = a;
            c.n12 = b;
            c.n21 = d;
            c.n22 = k;
        }
        return c;

    }
}