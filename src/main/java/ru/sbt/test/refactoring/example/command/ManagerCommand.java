package ru.sbt.test.refactoring.example.command;

import java.util.ArrayList;

public class ManagerCommand {
	private ArrayList<Command> listCommands = new ArrayList();
	public void addCommand(Command command) {
		listCommands.add(command);
		
	}
	public void run() {
		for(Command command:listCommands) {
			command.execute();
		}
		/*
		* Можем управлять командами как пожелаем,
		* при желании изменяя Менеджер команд
		*
		* */
	}	

}
