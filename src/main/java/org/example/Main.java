package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so n : ");
        int n = sc.nextInt();
        System.out.println("Bai 1 : "+tinhTongN(n));
        System.out.println("Bai 2 : "+tinhTongN2(n));
        System.out.println("Bai 3 : "+tinhTongN3(n));
    }
    public static int tinhTongN(int n){
        int sum = 0;
        if (n==0){
            return 0;
        }
        for (int i = 1; i <= n; i++){
            sum += i;
        }
        System.out.println(sum);
        return sum;
    }
    public static long tinhTongN2(int n){
        long sum = 0;
        if (n==0){
            return 0;
        }
        for (int i = 1; i <= n; i++){
            sum += (long) i *i;
        }
        return sum;
    }
    public static float tinhTongN3(int n){
        float sum = 0;
        if (n==0){
            return 0;
        }
        for (int i = 1; i <= n; i++){
            sum += 1.0f/i;
        }
        return sum;
    }
}