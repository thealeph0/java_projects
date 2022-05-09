import java.util.*;
public class DemoPoems
{
   public static void main(String[] args)
   {
      Poem poem1 = new Poem("The Raven", 84);
      Couplet poem2 = new Couplet("True Wit");
      Limerick poem3 = new Limerick("There was an Old Man with a Beard");
      Haiku poem4 = new Haiku("The Wren");
      display(poem1);
      display(poem2);
      display(poem3);
      display(poem4);
   }

   public static void display(Poem p)
   {
      System.out.println("Poem: " + p.getTitle() +
         "   Lines: " + p.getLines());
   }
}  

%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
  
public class Couplet extends Poem
{
     Couplet(String t)
     {
         super(t,2);
     }
     
}

%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

public class Limerick extends Poem
{
    Limerick(String t)
     {
         super(t,5);
     }
}

%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

public class Haiku extends Poem
{
    Haiku(String t)
     {
         super(t,3);
     }
}

%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

public class Poem
{
    private String title;
    private int lines;

    Poem(String t, int l)
    {
        title = t;
        lines = l;
    }

    public String getTitle()
    {
        return title;
    }

    public int getLines()
    {
        return lines;
    }

}

