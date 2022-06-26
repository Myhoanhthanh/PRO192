package carmanager;
/**
 *
 * @author baohc
 */
public class Car {
    private String Colour;
    private int EnginePower;
    private boolean Convertible;
    private boolean ParkingBrake;
    
    public Car() {
        Colour = "";
        EnginePower = 0;
        Convertible = false;
        ParkingBrake = false;
    }
    
    public Car(String Colour, int EnginePower, boolean Convertible, boolean ParkingBrake) {
        this.Colour = Colour;
        this.EnginePower = EnginePower;
        this.Convertible = Convertible;
        this.ParkingBrake = ParkingBrake;
    }
     public String getColour() {
        System.out.println("Colour: " + Colour);
        return Colour;
    }

    public int getEnginePower() {
        System.out.println("Colour: " + Colour);
        return EnginePower;
    }

    public boolean isConvertible() {
        if (Convertible) {
            System.out.println("Convertible: Yes");
        } else {
            System.out.println("Convertible: No");
        }
        return Convertible;
    }

    public boolean isParkingBrake() {
        if (ParkingBrake) {
            System.out.println("ParkingBrake: Yes");
        } else {
            System.out.println("ParkingBrake: No");
        }
        return ParkingBrake;
    }

    public void setColour(String Colour) {
        this.Colour = Colour;
    }

    public void setEnginePower(int EnginePower) {
        this.EnginePower = EnginePower;
    }

    public void setConvertible(boolean Convertible) {
        this.Convertible = Convertible;
    }

    public void setParkingBrake(boolean ParkingBrake) {
        this.ParkingBrake = ParkingBrake;
    }

    public void output() {
        System.out.println("Colour: " + Colour);
        System.out.println("Engine Power: " + EnginePower);
        if (Convertible) {
            System.out.println("Convertible: Yes");
        } else {
            System.out.println("Convertible: No");
        }
        if (ParkingBrake) {
            System.out.println("ParkingBrake: Yes");
        } else {
            System.out.println("ParkingBrake: No");
        }
    }

    public void pressAcceleratorButton() {
        System.out.println("You can press accelerator button");
        System.out.println("Colour: " + Colour);
        System.out.println("Engine Power: " + EnginePower);
        if (Convertible) {
            System.out.println("Convertible: Yes");
        } else {
            System.out.println("Convertible: No");
        }
        if (ParkingBrake) {
            System.out.println("ParkingBrake: Yes");
        } else {
            System.out.println("ParkingBrake: No");
        }
        
    }
    public void pressStartButton() {
        System.out.println("You can press the start button");
    }

    
}


