/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop2;
import java.util.Scanner;
/**
 *
 * @author baohc
 */
public class Part2_2 {
        public String inputString() throws Exception{
            String pattern = "SE\\d{3}";
            String idStudent = "";
            Scanner sc = new Scanner(System.in);
            
            System.out.print("Input the String: ");
            idStudent = sc.nextLine();
            
            if (!idStudent.matches(pattern)){
                throw new Exception();
                
            }
            
            return idStudent; 
    }
    
    public static void main(String[] args){
        Part2_2 obj = new Part2_2();
        boolean check = false;
        do {
            try {
                String idStudent = obj.inputString();
                System.out.println("The string is " + idStudent);
                check = false;
            } catch (Exception e){
                System.out.println("The String is invalid");
                check = true;
            }
        } while(check);
        
    }
}
