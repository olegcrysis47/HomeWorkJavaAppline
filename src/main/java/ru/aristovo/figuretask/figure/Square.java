package ru.aristovo.figuretask.figure;

public class Square extends Figure {

    public Square(double length) {
        super(length, length);
    }

    @Override
    public double calcArea() {
        return length * length;
    }
}
