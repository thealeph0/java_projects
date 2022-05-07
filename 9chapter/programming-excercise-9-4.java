Salesperson.java

public class Salesperson
{
   private int id;
   private double sales;
   Salesperson(int idNum, double amt)
   {
      id = idNum;
      sales = amt;
   }
   public int getId()
   {
      return id;
   }
   public double getSales()
   {
      return sales;
   }
   public void setId(int idNum)
   {
      id = idNum;
   }
   public void setSales(double amt)
   {
      sales = amt;
   }
}

%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
  
SalespersonSort

import java.util.*;
public class SalespersonSort
{
   public static void main(String[] args)
   {
      Scanner dagg = new Scanner(System.in); // input Scanner object
      Salesperson[] salespeople = new Salesperson[7]; //Create and initialize array
      int numID; //temp variable for the id number
      double sales; //temp variable for the sales value
      String order; //we will use this for the sorting option

      //for loop that runs up to the length of the array
      //we are going through each bin one by one by:
      //collecting the ID number and sales amount and 
      //we then add the result of the Salesperson class into the array
      for(int sub=0; sub<salespeople.length; ++sub)
      {
          System.out.print("Enter an ID number ");
          numID = dagg.nextInt();

          System.out.print("Enter sales value ");
          sales = dagg.nextDouble();

          salespeople[sub] = new Salesperson(numID, sales);
      }

      //sort option
      System.out.println("By which field do you want to sort?");
      System.out.println("(I)d number or (S)ales");
      //we would normally use nextLine(); but nextInt(); does not
      //clear memory buffer sooooo nextLine(); executes with a blank
      //TLIDR: using nextLine(); causes this to be completely skipped
      //next(); fixes this issue
      order = dagg.next();

      if(order.charAt(0) == 'I')
      {
          //we define these down below
          sortById(salespeople);
      }

      else if(order.charAt(0) == 'S')
      {
          //we define these down below
          sortBySales(salespeople);
      }

      for(int x = 0; x < salespeople.length; ++x)
      {
          String message="";
          message = message + "\nID " + salespeople[x].getId() +
             "  sales: " + salespeople[x].getSales();
          System.out.print(message);   
      }
          
   }

   //both of these methods are EXACTLY the same
   //figure out how one works for understanding
   public static void sortById(Salesperson[] info)
   {
       Salesperson temp;
       int max = info.length -1;

       for(int x = 0; x < max ; ++x)
       {
           for(int y = 0; y < max; ++y)
           {
               if(info[y].getId() > info[y+1].getId())
               {
                   temp = info[y];
                   info[y] = info[y+1];
                   info[y+1]=temp;
               }
           }
       }
   }

   public static void sortBySales(Salesperson[] info)
   {
       Salesperson temp;
       int max = info.length -1;

       for(int x = 0; x < max ; ++x)
       {
           for(int y = 0; y < max; ++y)
           {
               if(info[y].getSales() > info[y+1].getSales())
               {
                   temp = info[y];
                   info[y] = info[y+1];
                   info[y+1]=temp;
               }
           }
       }
   }
    
}
