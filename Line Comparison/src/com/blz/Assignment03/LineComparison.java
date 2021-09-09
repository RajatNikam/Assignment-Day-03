package com.blz.Assignment03;

import java.util.Scanner;

public class LineComparison {

    static int x1, x2, y1, y2;
    static double Length;
    static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");
        print();
    }

    public static void userInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter co-ordinate x1: ");
        x1 = sc.nextInt();
        System.out.println("Enter co-ordinate y1: ");
        y1 = sc.nextInt();
        System.out.println("Enter co-ordinate x2: ");
        x2 = sc.nextInt();
        System.out.println("Enter co-ordinate y2: ");
        y2 = sc.nextInt();
    }

    public static void formula() {
        Length = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void print() {
        userInput();
        formula();
        System.out.println("Length of Line 1: " + Length);
    }
}