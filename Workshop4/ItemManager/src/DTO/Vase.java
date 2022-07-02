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
public class Vase extends Item{

    private int height;
    private String material;
    
    public Vase(){
        height = 0;
        material = null;
    }

    public Vase(int height, String material) {
        this.height = height;
        this.material = material;
    }

    public int getHeight() {
        return height;
    }

    public String getMaterial() {
        return material;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    
    public void outputVase() {
        output();
        
        System.out.println("Height: " + height);
        System.out.println("Material: " + material);

    }


    public void inputVase() {

        input();
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Input a height of vase: ");
        height=sc.nextInt();
        
        System.out.print("Input a material of vase:  ");
        sc=new Scanner(System.in);
        material =sc.nextLine();
    }
}
