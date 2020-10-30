package ru.mirea.circle;

public class CircleTest {
    public static void main(String[] args){
        Circle one = new Circle(2.0,"red");
        System.out.print("Радиус: "+one.getRadius()+" Цвет: "+one.getColor()+" Площадь: "+one.getArea());

    }
}
