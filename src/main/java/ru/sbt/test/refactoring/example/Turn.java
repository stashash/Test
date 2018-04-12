package ru.sbt.test.refactoring.example;

public class Turn implements Command{

	private Figure figure;
	
	public Turn(Figure figure) {
		super();
		this.figure = figure;
	}

	public void execute() {	
		// TODO Auto-generated method stub
		figure.turnClockwise();
	}

}
