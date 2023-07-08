package bai4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap name: ");
        String n = sc.next();
        System.out.println("Nhap age: ");
        int a = sc.nextInt();
        System.out.println("Nhap class: ");
        String c = sc.next();
        Student student = new Student(n, a, c);
        System.out.println("Thong tin hoc sinh: ");
        System.out.println("Name: "  + student.getName());
        System.out.println("Age: "  +student.getAge());
        System.out.println("Class: "  +student.getClassName());
    }
}
