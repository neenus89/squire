package org.example.square;

import java.util.Scanner;

public class SquareClass {
    public static void main(String [] arg){
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();
        int squire = 1;

        for(i=0; i< b; i++){
            squire = squire * a;
        }
        System.out.println("Squire" +squire);
    }
}
