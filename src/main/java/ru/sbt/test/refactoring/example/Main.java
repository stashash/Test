package ru.sbt.test.refactoring.example;

import ru.sbt.test.refactoring.example.command.*;
import ru.sbt.test.refactoring.example.figure.Figure;
import ru.sbt.test.refactoring.example.figure.Tractor;

public class Main {

	public static void main(String[] args) {
		
		Figure tractor = new Tractor(new Point(0,0),new Field(5,5), Orientation.NORTH);
		Command forward = new Forward(tractor);
		Command turn = new Turn(tractor);
		Command shot = new Shot(tractor);
		ManagerCommand manager = new ManagerCommand();
		manager.addCommand(forward);
		manager.addCommand(turn);
		manager.addCommand(shot);
		tractor.setManager(manager);
		tractor.move();

		System.out.println("Hello");	

	}

}
