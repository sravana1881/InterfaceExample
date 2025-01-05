import Implementation.Circle;
import Implementation.Rectangle;
import Implementation.Triangle;
import Interface.Movable;

public class MyRunner {
    public static void main(String[] args) {

        Circle c1 = new Circle(1, 2, 2);
        System.out.println("Area of Circle " + c1.getArea());
        System.out.println("Coordinates are " + c1.getCoordinate());

        c1.moveDown();
        System.out.println("After move Down, Coordinates are " + c1.getCoordinate());

        c1.moveRight();
        System.out.println("After move right, Coordinates are " + c1.getCoordinate());

        c1.moveUp();
        System.out.println("After move Up, Coordinates are " + c1.getCoordinate());

        c1.moveLeft();
        System.out.println("After move left, Coordinates are " + c1.getCoordinate());


        System.out.println("--------Test Polymorphism-------");
        Movable c2 = new Circle(5, 10, 200);  // upcast
        c2.moveUp();
        System.out.println("After move up , Coordinates are " + c2.getCoordinate());

        c2.moveLeft();
        System.out.println("After move Left , Coordinates are " + c2.getCoordinate());

        System.out.println("============================================");

        Rectangle r1 = new Rectangle(2,4,8);
        System.out.println("Area of Rectangle " + r1.getArea());
        System.out.println("Coordinates are " + r1.getCoordinate());

        r1.getPerimeter();
        System.out.println("Perimeter is " + r1.getPerimeter());

        r1.getArea();
        System.out.println("Area is " + r1.getArea());

        r1.moveDown();
        System.out.println("After move Down, Coordinates are " + r1.getCoordinate());

        r1.moveRight();
        System.out.println("After move right, Coordinates are " + r1.getCoordinate());

        r1.moveUp();
        System.out.println("After move Up, Coordinates are " + r1.getCoordinate());

        r1.moveLeft();
        System.out.println("After move left, Coordinates are " + r1.getCoordinate());


        System.out.println("--------Test Polymorphism For Rectangle -------");
        Movable r2 = new Rectangle(6, 15, 90);  // upcast
        r2.moveUp();
        System.out.println("After move up , Coordinates are " + r2.getCoordinate());

        r2.moveLeft();
        System.out.println("After move Left , Coordinates are " + r2.getCoordinate());

        r2.moveDown();
        System.out.println("After move Down, Coordinates are " + r2.getCoordinate());

        r2.moveRight();
        System.out.println("After move right, Coordinates are " + r2.getCoordinate());

        System.out.println("======================================================");

        Triangle t1 = new Triangle(2,4,8);
        System.out.println("Area of Triangle " + t1.getArea());
        System.out.println("Coordinates are " + t1.getCoordinate());

        t1.getPerimeter();
        System.out.println("Perimeter is " + t1.getPerimeter());

        t1.getArea();
        System.out.println("Area is " + t1.getArea());

        t1.moveDown();
        System.out.println("After move Down, Coordinates are " + t1.getCoordinate());

        t1.moveRight();
        System.out.println("After move right, Coordinates are " + t1.getCoordinate());

        t1.moveUp();
        System.out.println("After move Up, Coordinates are " + t1.getCoordinate());

        t1.moveLeft();
        System.out.println("After move left, Coordinates are " + t1.getCoordinate());


        System.out.println("--------Test Polymorphism For Rectangle -------");
        Movable t2 = new Triangle(3, 5, 9);  // upcast
        t2.moveUp();
        System.out.println("After move up , Coordinates are " + t2.getCoordinate());

        t2.moveLeft();
        System.out.println("After move Left , Coordinates are " + t2.getCoordinate());

        t2.moveDown();
        System.out.println("After move Down, Coordinates are " + t2.getCoordinate());

        t2.moveRight();
        System.out.println("After move right, Coordinates are " + t2.getCoordinate());

        System.out.println("======================================================");
    }
}
