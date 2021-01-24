package ru.aristovo.figuretask.figure;

public class Triangle extends Figure {

    public Triangle(double length, double height) {
        super(length, height);
    }

    @Override
    public double calcArea() {
        return length * height / 2;
    }
}
