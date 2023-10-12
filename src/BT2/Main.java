package BT2;
import BT2.Point2D;
import BT2.Point3D;

public class Main {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(3.0, 4.0);
        System.out.println(point2D.toString());

        Point3D point3D = new Point3D(1.0, 2.0, 5.0);
        System.out.println(point3D.toString());
    }
}