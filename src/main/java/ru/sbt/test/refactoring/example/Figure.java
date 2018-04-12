package ru.sbt.test.refactoring.example;

import ru.sbt.test.refactoring.Orientation;

public interface Figure {
	
	int[] getPosistion();
	Orientation getOrientation();

	public void move();
	void moveForwards();
	void turnClockwise();
	void setManager(ManagerCommand manager);

}
