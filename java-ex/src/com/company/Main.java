package com.company;

public class Main {

    public static void main(String[] args) {
        Square square = new Square(3);
        square.drawSquare();
        System.out.println("=============================");

        Rectangle rectangle = new Rectangle(5,8);
        rectangle.drawRectangle();
        System.out.println("=============================");

        
    }
}