package Implementation;

import Interface.Movable;
import Model.Shape;

public class Rectangle extends Shape implements Movable {


    protected double area;
    protected double perimeter;
    private double width, height;
    public Rectangle() {
        super();
    }

    public Rectangle(double width, double height, double perimeter, double area) {
        this.width = width;
        this.height = height;
        this.perimeter = perimeter;
        this.area = area;
    }
//    public Rectangle(double width, double height, double perimeter) {
//        this.width = width;
//        this.height = height;
//        this.perimeter = perimeter;
//    }
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public Rectangle(double width,double height,double area) {
        this.width = width;
        this.height = height;
        this.area = area;
    }
    public double getPerimeter(){
        double perimeter = (2*(width+height));
        return perimeter;
    }
    @Override
    public double getArea() {
        double area=width*height;
        return area;
    }

    @Override
    public void moveUp() {
        height++;

    }

    @Override
    public void moveDown() {
      height--;
    }

    @Override
    public void moveLeft() {
       width--;
    }

    @Override
    public void moveRight() {
       width++;
    }

    @Override
    public String getCoordinate() {
        return "(" + width + "," + height + ")";
    }

    @Override
    public void displayshapeName() {
        super.displayshapeName();
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "area=" + area +
                ", perimeter=" + perimeter +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
