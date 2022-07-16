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
public class Statue extends Item {

    private int weight;
    private String colour;

    public Statue() {
        super();
        weight = 0;
        colour = "";
    }

    public Statue(int weight, String colour, int value, String creator) {
        super(value, creator);
        this.weight = weight;
        this.colour = colour;
    }

    public int getWeight() {
        return weight;
    }

    public String getColour() {
        return colour;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void outputStatue() {
        output();
        System.out.println("Weight: " + this.weight);
        System.out.println("Colour: " + this.colour);

    }

    public void inputStatue() {
        input();
        
        System.out.print("Input a weight of statue:  ");
        Scanner sc = new Scanner(System.in);
        weight = sc.nextInt();
        
        sc = new Scanner(System.in);
        System.out.print("Input a colour of statue: ");
        colour = sc.nextLine();

    }

}
