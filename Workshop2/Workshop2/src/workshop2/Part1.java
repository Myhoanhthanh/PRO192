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
public class Part1 {
    public static void main(String[] args){
        boolean check = false;
        
        do {
            try{
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter number: ");
                int number = sc.nextInt();
                
                if (number < 1){
                    throw new Exception();
                }
                
                System.out.println("The number is" + number);
                check = false;
                
            } catch (Exception e){
                System.out.println("The number is invalid");
                check = true;
            }
        } while (check);
    }
}
