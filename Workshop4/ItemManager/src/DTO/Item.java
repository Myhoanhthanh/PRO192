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
public class Item {

    private int value;
    private String creator;
    
    public Item(){
        value = 0;
        creator = null;
    }

    public Item(int value, String creator) {
        this.value = value;
        this.creator = creator;
    }

    public int getValue() {
        return value;
    }

    public String getCreator() {
        return creator;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }
    
    public void input(){
    
        boolean cont=false;
        
        do{
            
            try{
                
                Scanner sc=new Scanner(System.in); 
                System.out.print("Enter a value: ");
                value = sc.nextInt();
                
                if(value <= 0){
                    throw new Exception();
                }
                cont = false;
            }
            catch (Exception e){
                System.out.println("Input is error.");
                cont=true;
            }
        }
        
        while(cont);

        boolean cont1 = false;
        
        do{
            try{
                
                Scanner sc1 = new Scanner(System.in); 
                System.out.print("Enter a creator: ");
                creator = sc1.nextLine();
                
                if (creator.isEmpty()){
                    throw new Exception();
                }
                cont1 = false;
            }
            catch (Exception e){
                System.out.println("Input is error!");
                cont1 = true;
            }
        }
        while(cont1);
        
         
    }
    
    public void output(){
        System.out.println("Value: " + value);
        System.out.println("Creator: " + creator);
    }
    
    

}
