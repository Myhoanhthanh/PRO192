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
public class Statue extends Item{
    
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

public void outputStatue(){
    output();
    System.out.println("Weight: " + weight);
    System.out.println("Colour: " + colour);
    
} 
public void inputStatue(){
    input();
    boolean cont = false;
    do{
        try{
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a weight:");
            weight = sc.nextInt();
            if(weight <=0)
                throw new Exception();
            cont = false;
        }catch(Exception e){
            System.out.println("Input is error!");
            cont = true;
        }
    }while(cont);
    
    boolean cont1 = false;
    do{
        try{
            Scanner sc1 = new Scanner(System.in);
            System.out.print("Enter a colour:");
            colour = sc1.nextLine();
            if(colour.equals(""))
                throw new Exception();
            cont1 = false;
            
        }catch(Exception e){
            System.out.println("Input is error!");
            cont1= true;
        }
    }while(cont1);
    
}


    
}
