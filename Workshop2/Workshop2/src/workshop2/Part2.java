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
public class Part2 {
    public static void main(String[] args){
        boolean check = false ;
        Scanner sc = new Scanner(System.in);
        
        do {
            try {
                String idStudent = "";
                String pattern = "SE\\d{3}";
                
                System.out.print("Enter the string: ");
                idStudent = sc.nextLine();
                if (!idStudent.matches(pattern)){
                    throw new Exception();
                }
                check = true;
                System.out.println("The string is " + idStudent);
                }
             catch (Exception e){
                System.out.println("The string is invalid ");
                check = true;
            }
        } while (check);          
    } 
}

