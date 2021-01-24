package ru.aristovo.figuretask;

import ru.aristovo.figuretask.figure.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("Создаем треугольник, квадрат и ромб, и находим их площади");

        Figure triangle = new Triangle(5.4,2.6);
        System.out.println("Площадь треугольника = " + triangle.calcArea());

        Figure square = new Square(3.3);
        System.out.println("Площадь квадрата = " + square.calcArea());

        Figure rhombus = new Rhombus(1.5,6.1);
        System.out.println("Площадь ромба = " + rhombus.calcArea());

    }
}
