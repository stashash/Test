package ru.sbt.test.refactoring.example.Command;

import ru.sbt.test.refactoring.example.Command.Command;
import ru.sbt.test.refactoring.example.figure.Figure;

public class Shot implements Command {
    private Figure figure;

    public Shot(Figure figure) {
        this.figure = figure;
    }

    public void execute() {
        System.out.println("SHOT");
    }
}
