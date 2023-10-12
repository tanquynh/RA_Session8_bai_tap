package BT4;
import BT4.Shape;
import BT4.Triangle;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập độ dài của cạnh 1: ");
        double side1 = scanner.nextDouble();

        System.out.print("Nhập độ dài của cạnh 2: ");
        double side2 = scanner.nextDouble();

        System.out.print("Nhập độ dài của cạnh 3: ");
        double side3 = scanner.nextDouble();

        System.out.print("Nhập màu sắc của tam giác: ");
        String color = scanner.next();

        Triangle triangle = new Triangle(side1, side2, side3, color);

        System.out.println("Thông tin của tam giác:");
        System.out.println(triangle.toString());
        System.out.println("Diện tích của tam giác: " + triangle.getArea());
        System.out.println("Chu vi của tam giác: " + triangle.getPerimeter());

        scanner.close();
    }
}