package ru.sbt.test.refactoring.example;

import ru.sbt.test.refactoring.Orientation;
import ru.sbt.test.refactoring.TractorInDitchException;

public class Tractor implements Figure{
	
	private ManagerCommand manager;
	
	int[] position = new int[] { 0, 0 };
	int[] field = new int[] { 5, 5 };
	Orientation orientation = Orientation.NORTH;
	
	
	

	public void setManager(ManagerCommand manager) {
		this.manager = manager;
	}

	public void move() {
       manager.run();
	}

    public void moveForwards() {
    	System.out.println("forward");
		if (orientation == Orientation.NORTH) {
			position = new int[] { position[0], position[1] + 1 };
		} else if (orientation == Orientation.EAST) {
			position = new int[] { position[0] + 1, position[1] };
		} else if (orientation == Orientation.SOUTH) {
			position = new int[] { position[0], position[1] - 1 };
		} else if (orientation == Orientation.WEST) {
			position = new int[] { position[0] - 1, position[1] };
		}
		if (position[0] > field[0] || position[1] > field[1]) {
			throw new TractorInDitchException();
		}
	}

    public void turnClockwise() {
    	System.out.println("turn");
		if (orientation == Orientation.NORTH) {
			orientation = Orientation.EAST;
		} else if (orientation == Orientation.EAST) {
			orientation = Orientation.SOUTH;
		} else if (orientation == Orientation.SOUTH) {
			orientation = Orientation.WEST;
		} else if (orientation == Orientation.WEST) {
			orientation = Orientation.NORTH;
		}
	}

	public int[] getPosition() {
		return position;
	}

	public Orientation getOrientation() {
		return orientation;
	}

	public int[] getPosistion() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
