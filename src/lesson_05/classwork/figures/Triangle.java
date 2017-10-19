package lesson_05.classwork.figures;

/**
 * Created by ITClass2-9 on 04.10.2017.
 */

// Класс треугольник
    //final- нельзя наследовать от этого класса
public final class Triangle extends Figure{

    //Длины сторон треугольника
    private final double a;
    private final double b;
    private final double c;

    public Triangle(double a,double b,double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    @Override
    public double getArea(){
        double p=getPerimeter()/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
    @Override
    public double getPerimeter(){
        return a+b+c;
    }
    @Override
    public String toString() {
        return String.format("Треугольник со сторонами %.2f, %.2f, %.2f", a, b, c);
    }

}
