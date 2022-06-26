/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DTO.Colony;
import DTO.BeeColony;
import DTO.FPTUniversity;
import DTO.University;
import DTO.Role;
/**
 *
 * @author baohc
 */
public class Tester{

   public static void main(String[] args){

        Colony obj1 = new BeeColony("honey", "land", 2000);
        System.out.println(obj1);
        obj1.grow();
        obj1. reproduce();

        University obj2=new FPTUniversity("FPT", "Cantho", 100000);
        System.out.println(obj2);
        obj2.enroll();
        obj2.educate();
        
        Role df= new BeeColony("wasp", "land", 3000);
        System.out.println(df);
        df.createWorker();
    
        df= new FPTUniversity("FPT", "Hanoi", 10000);
        System.out.println(df);
        df. createWorker ();
            
   }
}
