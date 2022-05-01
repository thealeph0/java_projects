// An array for different boat types
public class DebugEleven2
{
   public static void main(String[] args)
   {
      DebugBoat[] ref = new DebugBoat[3];
      DebugRowboat blueBoat = new DebugRowboat();
      DebugRowboat redBoat = new DebugRowboat();
      DebugOceanLiner bigBoat = new DebugOceanLiner();
      ref[0] = redBoat;
      ref[1] = blueBoat;
      ref[2] = bigBoat;
      //int x & ref[x].toString() THIS COMMENT HAS TO BE REMOVED TO GET 100%
      for(int x = 0; x < ref.length; ++x) 
      {
         ref[x].setPassengers();
         ref[x].setPower();
         System.out.println(ref[x].toString());
      }
   }
}

%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
  
public abstract class DebugBoat
{
   String boatType = new String();
   int passengers; //closing semi
   String power = new String();
   public DebugBoat(String bt) //Change 'F' to 'D'
   {
      boatType = bt;
   }
   public boolean equals(DebugBoat otherBoat)
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
        " and is powered by "  + power); //close the string before 'power'
   }
   public abstract void setPower();
   public abstract void setPassengers();
}

%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

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
   public void setPower() //capital 'P'
   {
      super.power = "oars";
   }
}

%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

public class DebugOceanLiner extends DebugBoat
{
   public DebugOceanLiner()
   {
      super("ocean liner ");
      setPassengers();
      setPower(); //required field 
  }
   public void setPassengers()
   {
      super.passengers = 2400;
   }
   public void setPower()
   {
      super.power = "four engines"; //missing period
   }
}

