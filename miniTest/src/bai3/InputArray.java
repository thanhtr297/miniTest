package bai3;

import java.util.Scanner;

public class InputArray {
    public static void main(String[] args) {
        int n ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao do dai cua mang: ");
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhap vao phan thu thu: " + i);
            arr[i] = sc.nextInt();
        }
        for (int value:arr) {
            System.out.print(value + " " );
        }
    }
}
