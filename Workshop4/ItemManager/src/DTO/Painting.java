/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.util.Scanner;

/**
 *
 * @author baohc
 */
public class Painting extends Item {

    private int height;
    private int width;
    private boolean isWatercolour;
    private boolean isFramed;

    public Painting() {
        height = 0;
        width = 0;
        isWatercolour = false;
        isFramed = false;

    }

    public Painting(int height, int width, boolean isWatercolour, boolean isFramed) {
        this.height = height;
        this.width = width;
        this.isWatercolour = isWatercolour;
        this.isFramed = isFramed;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public boolean isIsWatercolour() {
        return isWatercolour;
    }

    public boolean isIsFramed() {
        return isFramed;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setIsWatercolour(boolean isWatercolour) {
        this.isWatercolour = isWatercolour;
    }

    public void setIsFramed(boolean isFramed) {
        this.isFramed = isFramed;
    }

    public void outputPainting() {
        output();
        System.out.println("Height: " + height);
        System.out.println("Width: " + width);
        System.out.println("IsWatercolour: " + isWatercolour);
        System.out.println("IsFramed: " + isFramed);
    }

    public void inputPainting() {
        input();
        boolean cont = false;
        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter a height: ");
                height = sc.nextInt();
                if (height <= 0) {
                    throw new Exception();
                }
                cont = false;
            } catch (Exception e) {
                System.out.println("Enter is error!");
                cont = true;
            }
        } while (cont);

        boolean cont1 = false;
        do {
            try {
                Scanner sc1 = new Scanner(System.in);
                System.out.print("Enter a width: ");
                width = sc1.nextInt();
                if (width <= 0) {
                    throw new Exception();
                }
                cont1 = false;
            } catch (Exception e) {
                System.out.println("Input is error!");
                cont1 = true;
            }
        } while (cont1);

        boolean cont2 = false;
        do {
            try {
                Scanner sc2 = new Scanner(System.in);
                System.out.print(".Enter a watercolour: ");
                isWatercolour = sc2.nextBoolean();
                if (isWatercolour != true && isWatercolour != false) {
                    throw new Exception();
                }
                cont2 = false;
            } catch (Exception e) {
                System.out.println("Input is error!");
                cont2 = true;
            }
        } while (cont2);

        boolean cont3 = false;
        do {
            try {
                Scanner sc3 = new Scanner(System.in);
                System.out.print("Enter a framed: ");
                isFramed = sc3.nextBoolean();
                if (isFramed != true && isFramed != false) {
                    throw new Exception();
                }
                cont3 = false;
            } catch (Exception e) {
                System.out.println("Input is error!");
                cont3 = true;
            }
        } while (cont3);

    }

}
