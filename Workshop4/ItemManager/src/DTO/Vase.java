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
        output(); // call the inherited method to print two fields out: value, creator
        System.out.println("Height: " + height);
        System.out.println("Material: " + material);

    }


    public void inputVase() {

        input();
        boolean cont = false;

        do{
            try{
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter a height:");
                height = sc.nextInt();
                if(height <=0)
                    throw new Exception();
                cont = false;
            }catch(Exception e){
                System.out.println("Input error");
                cont = true;
            }
        }while(cont);
        boolean cont1 = false;
        do{
            try{
                Scanner sc1 = new Scanner(System.in);
                System.out.print("Enter a material:");
                material = sc1.nextLine();
                if(material.equals(""))
                    throw new Exception();
                cont1 = false;
            }catch (Exception e){
                System.out.println("Input is error!");
                cont1 = true;
            }
        }while(cont1);

    }


}
