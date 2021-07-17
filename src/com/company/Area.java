package com.company;

import java.util.Scanner;

public class Area {
    int breath, length;

    public Area(int breath, int length) {
        this.breath = breath;
        this.length = length;
    }

    public int returnArea() {
        return breath * length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of length: ");
        int l = sc.nextInt();
        System.out.println("Enter the value of breath: ");
        int b = sc.nextInt();
        Area a = new Area(l,b);
        System.out.println("Area is: " +a.returnArea());
    }
}
