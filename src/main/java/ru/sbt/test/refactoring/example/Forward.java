package ru.sbt.test.refactoring.example;

import ru.sbt.test.refactoring.Orientation;
import ru.sbt.test.refactoring.TractorInDitchException;

public class Forward implements Command {
	
	private Figure figure;
	

	public Forward(Figure figure) {
		super();
		this.figure = figure;
	}


	public void execute() {
		figure.moveForwards();
		
		
	}
	
}
