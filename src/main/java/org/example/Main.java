package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double b,ik;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Boyunuzu Giriniz (cm) : ");
        b=scanner.nextDouble();
        System.out.print("Cinsiyetiniz [ 1-Erkek / 2-Kadın ] : ");
        int c = scanner.nextInt();
        if(c==1)
            ik = 50+2.3*(b/2.54-60);
        else
            ik = 45.5+2.3*(b/2.54-60);
        System.out.printf("\nİdeal Kilonuz (kg) : %2f\n",ik);
    }
}