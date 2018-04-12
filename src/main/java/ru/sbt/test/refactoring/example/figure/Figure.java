package ru.sbt.test.refactoring.example.figure;


import ru.sbt.test.refactoring.example.Field;
import ru.sbt.test.refactoring.example.command.ManagerCommand;
import ru.sbt.test.refactoring.example.Orientation;
import ru.sbt.test.refactoring.example.Point;

public interface Figure {

	int getPositionX();
	int getPositionY();
	void setPosition(Point point);
	Point getPosition();
	Field getField();
	void setField(Field field);

	Orientation getOrientation();
	void setOrientation(Orientation orientation);

	public void move();
	void setManager(ManagerCommand manager);

}
