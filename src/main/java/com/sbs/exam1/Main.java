package com.sbs.exam1;

public class Main {
    private static void sub1(int age, String name) {
        System.out.println(age);
        System.out.println(name);
    }

    public static void main(String[] args) {
        int num = 10;

        System.out.printf("!");
        System.out.printf("@");
        System.out.printf("++");

        num++;
        num++;

        sub1(22, "홍길동");

        for (int i = 1; i <= 5; i++) {

            System.out.println("i = " + i);
        }
    }
}
