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
        super();
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
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a height of painting: ");
         height = sc.nextInt();
        
         
         sc = new Scanner(System.in);
         System.out.print("Input a width of painting: ");
         width = sc.nextInt();
         
         sc = new Scanner(System.in);
         System.out.print("Is the painting watercolor ? ( true or false )");
         isWatercolour = sc.nextBoolean();
         
         sc = new Scanner(System.in);
         System.out.print("Is the painting framed ? ( true or false ) ");
         isFramed = sc.nextBoolean();
         
         

    }

}
