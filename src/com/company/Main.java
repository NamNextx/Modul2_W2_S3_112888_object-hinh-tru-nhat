package com.company;

import java.util.Scanner;

public class Main {
    double width, height;

    public Main() {

    }

    public Main(int width, int height) {
        this.width = width;
        this.height = height;
    }

    private double getArea() {
        double Area = this.width * this.height;
        return Area;
    }

    private double getPerimeter() {
        double perimeter = (this.width + this.height) * 2;
        return perimeter;
    }

    private void display() {
        System.out.println("Arrea= " + getArea());
        System.out.println("perimeter= " + this.getPerimeter());
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your value width : ");
        int width=sc.nextInt();
        System.out.println("Enter yout value height: ");
        int height=sc.nextInt();

        Main main = new Main(width, height);
        main.display();
    }
}
