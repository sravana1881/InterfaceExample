package Implementation;

import Interface.Movable;
import Model.Shape;

public class Triangle  extends Shape implements Movable {
    private double side;
    private double base;
    private double height;
    protected double area;
    protected double perimeter;

    public Triangle(double side, double base, double height) {
        this.side = side;
        this.base = base;
        this.height = height;
    }

    public Triangle() {
        super();
    }
    public double getSide() {
        return side;
    }
    public double getPerimeter(){
        double perimeter = side + base + height;
        return perimeter;
    }

    @Override
    public double getArea() {
        double area=(base*height)/2;
        return area;
    }

    public void setArea(double area) {
        this.area = area;
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
       base--;
    }

    @Override
    public void moveRight() {
      base++;
    }

    @Override
    public String getCoordinate() {
        return "(" + side + "," + base + "," + height + ")";
    }

    @Override
    public void displayshapeName() {
        super.displayshapeName();
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side=" + side +
                ", base=" + base +
                ", height=" + height +
                ", baseArea=" + area +
                ", perimeter=" + perimeter +
                '}';
    }
}
