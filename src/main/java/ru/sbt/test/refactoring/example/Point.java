package ru.sbt.test.refactoring.example;

public class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Point changeXPosition(int changeXPosition){
        return new Point(x + changeXPosition, y);
    }

    public Point changeYPosition(int changeYPosition){
        return new Point(x, y + changeYPosition);
    }
}