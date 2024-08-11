package org.example;

import java.util.Scanner;

public class Fibo {
    public void fibonacii(int n) {
        int a=0;
        int b = 1;
        int i=2;
       for(i=2;i<=n;i++){
            int temp = b;
            b = b + a;
            a = temp;

        }
        System.out.println(b);
    }
    public static void main(String[] args) {
        Fibo obj = new Fibo();
        obj.fibonacii(12);

    }
}
