package BT1;
import BT1.Circle;
import BT1.Cylinder;
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0, "Red");
        System.out.println(circle.toString());
        System.out.println("Area: " + circle.getArea());

        Cylinder cylinder = new Cylinder(3.0, "Blue", 10.0);
        System.out.println(cylinder.toString());
        System.out.println("Area: " + cylinder.getArea());
        System.out.println("Volume: " + cylinder.getVolume());
    }
}
