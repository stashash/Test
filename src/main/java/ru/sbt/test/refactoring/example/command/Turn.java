package ru.sbt.test.refactoring.example.command;

import ru.sbt.test.refactoring.example.figure.Figure;

public class Turn implements Command {

	private final Figure figure;
	
	public Turn(Figure figure) {
		this.figure = figure;
	}

	public void execute() {
		System.out.println("turn");
		figure.setOrientation(figure.getOrientation().turnClockwise());

	}

}
