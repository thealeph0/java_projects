// QuartsToGallons.java
public class QuartsToGallons {
    public static void main(String[] args) 
    {
        final int QUARTS_IN_GALLON = 4;
        int quartsNeeded = 18;

        System.out.print("A job that needs ");
        System.out.print(quartsNeeded + " quarts "); // variable and string quarts
        System.out.print("requires " + quartsNeeded/QUARTS_IN_GALLON + " gallons "); //strings and variable division
        System.out.println("plus " + quartsNeeded%QUARTS_IN_GALLON + " quarts."); //strings and modulo 
    }
}
