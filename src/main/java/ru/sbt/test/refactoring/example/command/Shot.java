package ru.sbt.test.refactoring.example.command;

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
