package com.java.programs.practicepro;
import java.util.Scanner;

public class circleArea {
    public static void main(String [] args){
        Scanner scanner = new Scanner (System.in);

        System.out.print("Enter your radius: ");
        int radius = scanner.nextInt();
        double pai = 3.14159;
        double area = pai*radius*radius;

        System.out.println("Area of circle: "+area);
    }
}
