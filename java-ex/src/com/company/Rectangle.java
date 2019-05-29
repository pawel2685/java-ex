package com.company;

public class Rectangle {

    public int width;
    public int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void drawRectangle() {
        for (int i = 1; i <= width; i++) {
            for (int j = 1; j <= height; j++) {
                if (i == 1 || i == width)
                    System.out.print("  *");
                else if (j == 1 || j == height)
                    System.out.print("  *");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
    }
}
