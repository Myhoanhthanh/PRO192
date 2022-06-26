/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author baohc
 */

public class BeeColony extends Colony implements Role{
    private String type;
    
    public BeeColony(){
        type = "";
    }

    public BeeColony(String type, String place, int size) {
        super(place, size);
        this.type = type;
    }

    

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    @Override
    public String toString(){
        return "The colony's type is " + type + "the value of type field " + "size is about " + size + ", and the place is " + place;
    }
    
    @Override
    public void createWorker(){
        System.out.println("Worker bees perform all the work of the bees");
    }
    
    
    
    
}
