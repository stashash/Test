package ru.sbt.test.refactoring.example.figure;

import ru.sbt.test.refactoring.example.figure.AbstractFigure;

public class Tank{
    private Tractor tractor;
    private int armor = 100;
    private int bullet = 100;

    public Tank(Tractor tractor) {
        this.tractor = tractor;
    }



    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getBullet() {
        return bullet;
    }

    public void setBullet(int bullet) {
        this.bullet = bullet;
    }
}
