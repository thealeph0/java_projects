// A Vacation is 10 days
// but an ExtendedVacation is 30 days
public class DebugTen2
{
   public static void main(String args[]) 
   {
      DebugVacation myVacation = new DebugVacation(); //missing an 's'
      DebugExtendedVacation yourVacation =
         new DebugExtendedVacation();
      System.out.println("My vacation is for " +
         myVacation.getDays() + " days"); //getDays()
      System.out.println("Your vacation is for " +
         yourVacation.getDays() + " days");
   }
}

%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
 
public class DebugVacation
{
   protected int days;
   public DebugVacation()
   {
      days = 10;
   }
   public int getDays() //getDays
   {
      return days;
   }
}

%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
  
public class DebugExtendedVacation extends DebugVacation //extends
{
   public DebugExtendedVacation() //remove Fix
   {
      days = 30;
   }
}
