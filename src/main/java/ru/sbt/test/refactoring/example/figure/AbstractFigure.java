package ru.sbt.test.refactoring.example.figure;

import ru.sbt.test.refactoring.example.*;
import ru.sbt.test.refactoring.example.command.ManagerCommand;

abstract class AbstractFigure implements Figure {

    private ManagerCommand manager; // При желании сопоставить команды с определенной фигурой.
    private Point position;
    private Field field;
    Orientation orientation;




    public void setManager(ManagerCommand manager) {
        this.manager = manager;
    }

    public void move() {
        manager.run();
    }

    public int getPositionX() {
        return position.getX();
    }

    public int getPositionY() {
        return position.getY();
    }

    public void setPosition(Point position) {
        this.position = position;
    }
    public Point getPosition() {
        return position;
    }

    public Orientation getOrientation() {
        return orientation;
    }

    public void setOrientation(Orientation orientation) {
        this.orientation = orientation;
    }

    public Field getField() {
        return field;
    }

    public void setField(Field field) {
        this.field = field;

    }
}
