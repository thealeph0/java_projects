import java.util.*;
class TimesAndInstructors
{
   public static void main(String[] args)
   {
       String[][] courses =  {{"CIS101", "Mon 9 am","Farrell",},
                            {"CIS210","Mon 11 am","Patel"},
                            {"MKT100","Tues 830 am","Wong"},
                            {"ACC150","Tues 6 pm","Deitrich",},
                            {"CIS101","Fri 1 pm","Lennon "}};

       Scanner key = new Scanner(System.in);
       String name;
       boolean j = false;

       System.out.println("Enter a course: ");
       name = key.nextLine();

       for(int i = 0; i <= courses.length - 1 ; ++i)
       {
           if(courses[i][0].equals(name))
           {
               System.out.print("Course: " + courses[i][0] + "\t");
               System.out.print("Time: " + courses[i][1] + "\t");
               System.out.print("Instructor: " + courses[i][2]);
               j = true;
           }
           
       }
       
       while(!j) 
           {
               System.out.print("Invalid Entry: No Such Course.");

               System.out.println("Enter a course: ");
               name = key.nextLine();
               
               for(int i = 0; i <= courses.length - 1 ; ++i)
               {
                  if(courses[i][0].equals(name))
                   {
                       System.out.print("Course: " + courses[i][0] + "\t");
                       System.out.print("Time: " + courses[i][1] + "\t");
                       System.out.print("Instructor: " + courses[i][2]);
                       j = true;
                   } 
               }   
           }

   }
}
   
