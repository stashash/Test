package ru.sbt.test.refactoring.example;

public enum Orientation {
    NORTH {
        public Point moveForward(Point oldPosition) {
            return oldPosition.changeYPosition(1);
        }

        public Orientation turnClockwise() {
            return EAST;
        }
    },
    WEST {
        public Point moveForward(Point oldPosition) {
            return oldPosition.changeXPosition(-1);
        }

        public Orientation turnClockwise() {
            return NORTH;
        }
    },
    SOUTH {
        public Point moveForward(Point oldPosition) {
            return oldPosition.changeYPosition(-1);
        }

        public Orientation turnClockwise() {
            return WEST;
        }
    },
    EAST {
        public Point moveForward(Point oldPosition) {
            return oldPosition.changeXPosition(1);
        }

        public Orientation turnClockwise() {
            return SOUTH;
        }
    };

    public abstract Point moveForward(Point oldPosition);

    public abstract Orientation turnClockwise();
}