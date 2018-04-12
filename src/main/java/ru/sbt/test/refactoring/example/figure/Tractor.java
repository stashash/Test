package ru.sbt.test.refactoring.example.figure;


import ru.sbt.test.refactoring.example.Field;
import ru.sbt.test.refactoring.example.Orientation;
import ru.sbt.test.refactoring.example.Point;
import ru.sbt.test.refactoring.example.figure.AbstractFigure;

public class Tractor extends AbstractFigure {
	public Tractor(Point point, Field field, Orientation orientation){
		setPosition(point);
		setField(field);
		setOrientation(orientation);
	}
}
