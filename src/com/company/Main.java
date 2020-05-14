package com.company;

public class Main {

    public static void main(String args[]) {


        Dot dot = new Dot(4, 4);
        Dot dot1 = new Dot(2, 2);
        Dot dot2 = new Dot(1.5,3);

        Square square = new Square(dot1, 4);
        Rectangle rectangle = new Rectangle(dot2,3, 6);
        Circle circle = new Circle(dot, 5);

        System.out.println("CIRCLE");

        System.out.println(circle.circumference());
        System.out.println(circle.surfaceArea());
        System.out.println(circle.circumscription());
        System.out.println(circle.toString());

        System.out.println("\nRECTANGLE");

        System.out.println(rectangle.circumference());
        System.out.println(rectangle.circumscription());
        System.out.println(rectangle.surfaceArea());

        System.out.println("\nSQUARE");

        System.out.println(square.circumscription());
        System.out.println(square.surfaceArea());
        System.out.println(square.circumference());

        System.out.println(dot.distance(dot1));


    }
}
