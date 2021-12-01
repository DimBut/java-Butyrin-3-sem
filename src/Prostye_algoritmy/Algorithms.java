package Prostye_algoritmy;

import java.util.Arrays;

public class Algorithms {
    public static void main(String[] args) {
        int n=56;
        System.out.println(Arrays.toString(sieveOfEratosthenes(n)));
        System.out.println(Arrays.toString(primes(n)));
        System.out.println(Arrays.deepToString(mnozyteli(n)));

    }

    private static boolean[] sieveOfEratosthenes(int n) {
        boolean[] prime = new boolean[n+1];
        Arrays.fill(prime, true);
        prime[0] = false;
        prime[1] = false;
        for (int i=2; i*i<prime.length; i++) {
            if (prime[i]) {
                for (int j = 2; i * j < prime.length; j++)
                    prime[i * j] = false;
            }
        }
        return prime;
        }

    private static int[] primes(int n){
        int k=0;
        for (int i=0; i<sieveOfEratosthenes(n).length;i++){
            if (sieveOfEratosthenes(n)[i])
                k=k+1;
        }
        int[] primes = new int[k];
        int m=0;
        for (int i = 0; i < sieveOfEratosthenes(n).length; i++) {
            if (sieveOfEratosthenes(n)[i]) {
                primes[m] = i;
                m = m+1;
            }
        }
        return primes;
    }
    private static int[][] mnozyteli(int n) {
        int l = n;
        int m = 1;
        for (int i = 0; i < primes(n).length; i++) {
            int k = 0;
            while ((l % primes(n)[i] == 0) && (l!=1)) {
                l = l / primes(n)[i];
                k = k + 1;
            }
            if ((l>1) && (k!=0))
                m=m+1;
        }

        int[][] mnozyteli = new int[m][];
        m=0;
        l=n;
        for (int i=0;i<primes(n).length-1;i++) {//не додумался как умнее, поэтому еще раз по циклу пошел
            int k=0;
            while (l % primes(n)[i] == 0) {
                l = l / primes(n)[i];
                k = k + 1;
            }
            if (k != 0) {
                mnozyteli[m] = new int []{primes(n)[i], k};
                m = m + 1;
            }
        }
        return mnozyteli;

    }



}


