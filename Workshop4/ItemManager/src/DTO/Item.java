
package DTO;
import java.util.Scanner;
/**
 *
 * @author baohc
 */
public class Item {

    protected int value;
    protected String creator;
    
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
    
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a value of Item: ");
        value = sc.nextInt();
        
        sc = new Scanner(System.in);
        System.out.print("Input a creator of Item: ");
        creator = sc.nextLine();
        
         
    }
    
    public void output(){
        System.out.println("Value: " + this.value);
        System.out.println("Creator: " + this.creator);
    }
    
    

}
