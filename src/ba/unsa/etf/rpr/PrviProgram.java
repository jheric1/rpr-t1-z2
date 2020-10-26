package ba.unsa.etf.rpr;

import java.util.Scanner;
public class PrviProgram {
    public static int SumaCifara(int n){
        int cifra, suma=0;
        while(n!=0){
            cifra=n%10;
            suma+=cifra;
            n/=10;
        }
        return suma;
    }
    public static void main(String[] args) {
        // write your code here
        int n;

        Scanner ulaz = new Scanner(System.in);
        System.out.println("Unesite broj n: ");
        n = ulaz.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % (SumaCifara(i)) == 0) System.out.println(i);
        }

    }
}