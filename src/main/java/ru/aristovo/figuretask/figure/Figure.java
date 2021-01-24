package ru.aristovo.figuretask.figure;

public abstract class Figure {

    protected double length;    //Длина фигуры (см)
    protected double height;    //Высота фигуры (см)
    protected double area;      //Площадь фигуры (см^2)

    //Конструктор с первыми двумя полями
    public Figure(double length, double height) {
        this.length = length;
        this.height = height;
    }

    //Абстрактный метод для расчета площади фигуры
    public abstract double calcArea();

}
