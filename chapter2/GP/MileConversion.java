// Version #2 Using Methods
import java.util.Scanner; //including the scanner class

class MileConversionsInteractive
{
   public static void main(String[] args) 
   {
      // Modify the code below
      Scanner inPut = new Scanner(System.in); //instantiate
      System.out.print("Enter miles >> ");
      double miles = inPut.nextDouble(); //user input

      conv(miles);
   }

   public static void conv(double miles)
   {
       final double INCHES_IN_MILE = 63360;
       final double FEET_IN_MILE = 5280;
       final double YARDS_IN_MILE = 1760;
     double in = miles * INCHES_IN_MILE;
     double ft = miles * FEET_IN_MILE;
     double yds = miles * YARDS_IN_MILE;
      System.out.println(miles + " miles is " + in + 
         " inches, or " + ft + " feet, or " + 
         yds + " yards");
   }
}
