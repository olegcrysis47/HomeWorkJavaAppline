package ru.aristovo.figuretask.figure;

public class Rhombus extends Figure {

    public Rhombus(double length, double height) {
        super(length, height);
    }

    @Override
    public double calcArea() {
        return length * height;
    }
}
