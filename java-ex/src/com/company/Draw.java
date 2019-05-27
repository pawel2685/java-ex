package com.company;

public class Draw {

    private int sideSize;

    public Draw(int sideSize) {
        this.sideSize = sideSize;
    }

    public void draw() {
        for (int i = 1; i <= sideSize; i++) {
            for (int j = 1; j <= sideSize; j++) {
                if (i == 1 || i == sideSize)
                    System.out.print("  *");
                else if (j == 1 || j == sideSize)
                    System.out.print("  *");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
    }
}
