// Creates and displays an array of boats -
// some are rowboats; some are ocean liners
import java.util.*;
public class DebugEleven4
{
   static Scanner input = new Scanner(System.in);
   static DebugBoat[] boatArray = new DebugBoat[5];
   public static void main(String[] args) 
   {
      buildArray(); //method require parenthesis
      displayArray();
   }
   public static void buildArray()
   {
     char boatType;
     //new keyword missing & initizialize counter
     for(int x = 0; x < boatArray.length; ++x) 
     {
        boatType = getBoat();
        if(boatType =='r')
 	     boatArray[x] = new DebugRowboat(); 
        else
          boatArray[x] = new DebugOceanLiner();
     }
   }
   public static char getBoat()
   {
      String boatType;

      System.out.println("Enter r for rowboat; o for ocean liner ");
      boatType = input.next();
        
      return boatType.charAt(0);
   }
   public static void displayArray()
   {
      for(int x = 0; x < boatArray.length; ++x) //increase counter
      System.out.println("Boat #" + (x  + 1) + " " +
         boatArray[x].toString());
   }
}

%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
  
public abstract class DebugBoat
{
   String boatType = new String();
   int passengers; //closing semi
   String power = new String();
   public DebugBoat(String bt) //change 'F' to 'D'
   {
      boatType = bt;
   }
   public boolean equals(DebugBoat otherBoat) //DebugBoat Object type
   {
      boolean result;
      if((passengers == otherBoat.passengers) && (power.equals(otherBoat.power)))
         result = true;
      else
         result = false; //false
      return result; //closing semi
   }
   public String toString()
   {
      return("This " + boatType + "boat carries " + passengers +
        " and is powered by "  + power); //closing string quote
   }
   public abstract void setPower();
   public abstract void setPassengers();
}

%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

public class DebugOceanLiner extends DebugBoat
{
   public DebugOceanLiner()
   {
      super("ocean liner ");
      setPassengers();
      setPower();
  }
   public void setPassengers()
   {
      super.passengers = 2400;
   }
   public void setPower()
   {
      super.power = "four engines"; //super.power
   }
}

%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

public class DebugRowboat extends DebugBoat
{
   public DebugRowboat()
   {
      super("row");
      setPassengers();
      setPower();
   }
   public void setPassengers()
   {
      super.passengers = 2;
   }
   public void setPower() //capitalize 'P'
   {
      super.power = "oars";
   }
}
