package BT3;
import BT3.Point;
import BT3.MoveablePoint;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(3, 4);
        System.out.println(point.toString());

        MoveablePoint moveablePoint = new MoveablePoint(1, 2, 1, 1);
        System.out.println(moveablePoint.toString());

        moveablePoint.move();
        System.out.println(moveablePoint.toString());
    }
}
