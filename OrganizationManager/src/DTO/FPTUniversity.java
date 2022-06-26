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
public class FPTUniversity extends University implements Role {
    private String address;
    
    public FPTUniversity(){
        address = "";
    }
    
    public FPTUniversity(String address, String name, int size) {
        super(name, size);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public String toString(){
        return "FPTU has four campuses Hanoi, HCM, DaNang, CanTho, QuyNhon";
    }
    
    @Override
    public void createWorker(){
        System.out.println("providing human resources");
    }
    
    
}
