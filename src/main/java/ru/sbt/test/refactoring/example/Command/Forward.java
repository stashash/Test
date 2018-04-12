package ru.sbt.test.refactoring.example.Command;


import ru.sbt.test.refactoring.example.figure.Figure;

public class Forward implements Command {
	
	private final Figure figure;
	

	public Forward(Figure figure) {
		this.figure = figure;
	}

	public void execute() {

		System.out.println("forward");
        figure.setPosition(figure.getOrientation().moveForward(figure.getPosition()));

	}
	
}
