package ru.sbt.test.refactoring.example;

public class Main {

	public static void main(String[] args) {
		
		Figure tractor = new Tractor();
		Command forward = new Forward(tractor);
		Command turn = new Turn(tractor);
		ManagerCommand manager = new ManagerCommand();
		manager.addCommand(forward);
		manager.addCommand(turn);
		
		tractor.setManager(manager);
		tractor.move();
		
		// TODO Auto-generated method stub
		
		System.out.println("Hello");	

	}

}
