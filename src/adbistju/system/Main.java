package adbistju.system;

import adbistju.system.one.models.Gender;
import adbistju.system.one.models.MaternityHome;
import adbistju.system.three.models.*;

public class Main {
    public static void main(String[] args) {
//        double area = (2*radius)/Math.sqrt(2); Формула стороны квадрата через радиус описанной окружности
//        double area = ((double)1/2)*(radius*radius)*angle*Math.sin(Math.toRadians((double) 360/angle));//Math.PI * x / 200

        System.out.println("ONE");
        System.out.println(MaternityHome.getNewPerson("Bob", "Kopis","Bobik","Austria","address", "88005553535",45, Gender.MALE));

        System.out.println("TWO");

        System.out.println("THREE");
        Nfigure nfigure = new Nfigure(3,4);
        Circle circle = new Circle(3);
        Triangle triangle = new Triangle(3,4);
        Square square = new Square(1.5f);
        Figure[] figures = new Figure[4];
        figures[0] = nfigure;
        figures[1] = circle;
        figures[2] = triangle;
        figures[3] = square;
        for (int i = 0; i < figures.length; i++) {
            figures[i].drawFigure();
        }
    }
}
