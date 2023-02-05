
package com.bridgelabz.line_comparison;

import java.util.Scanner;

public class LineComparison {
    static double line1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of first line");
        System.out.println("Enter starting point x coordinate");
        int x1 = scanner.nextInt();

        System.out.println("Enter starting point y coordinate");
        int y1 = scanner.nextInt();

        System.out.println("Enter end point x coordinate");
        int x2 = scanner.nextInt();

        System.out.println("Enter end point y coordinate");
        int y2 = scanner.nextInt();

        System.out.print("Using the Cartesian system length of first line =");
        double length1 = Math.sqrt((x2 - x1) ^ 2 + (y2 - y1) ^ 2);
        System.out.println(length1);

        return length1;
    }

    static double line2() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value of second line");
        System.out.println("Enter starting point x coordinate");
        int ax1 = scanner.nextInt();

        System.out.println("Enter starting point y coordinate");
        int ay1 = scanner.nextInt();

        System.out.println("Enter end point x coordinate");
        int ax2 = scanner.nextInt();

        System.out.println("Enter end point y coordinate");
        int ay2 = scanner.nextInt();

        System.out.print("Using the Cartesian system length of second line =");
        double length2 = Math.sqrt((ax2 - ax1) ^ 2 + (ay2 - ay1) ^ 2);
        System.out.println(length2);
        return length2;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");

        System.out.println("Compare both lines : ");

        double length1 = line1();
        double length2 = line2();

        if (length1 == length2) {
            System.out.println("Both line are equal");

        } else if (length1 < length2) {
            System.out.println("line 2 is greater than line 1");

        } else {
            System.out.println("line 1 is greater than line 2");
        }
    }
}
