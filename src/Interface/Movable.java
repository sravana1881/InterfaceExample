package Interface;

public interface Movable {
    //double getPerimeter();

    void moveUp();    // "public" and "abstract" by default
    void moveDown();
    void moveLeft();
    void moveRight();
    String getCoordinate();
}
