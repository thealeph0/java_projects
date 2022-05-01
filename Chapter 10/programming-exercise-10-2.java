public class DemoCandles //pre--made
{
   public static void main(String args[])
   {
      Candle aCandle = new Candle();
      ScentedCandle aScentedCandle = new ScentedCandle();
      aCandle.setColor("pink");
      aCandle.setHeight(6);
      aScentedCandle.setColor("white");
      aScentedCandle.setScent("gardenia");
      aScentedCandle.setHeight(6);
      System.out.println("The " + aCandle.getHeight() +
         " inch " + aCandle.getColor() +
         " candle costs $" + aCandle.getPrice());
     System.out.println("The " + aScentedCandle.getHeight() + " inch " +
        aScentedCandle.getScent() +
        " " + aScentedCandle.getColor() +
        " candle costs $" + aScentedCandle.getPrice());
   }
}

%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
  
public class Candle
{
    private String color;
    private int height;
    protected double price; //we use this same name for both super and sub

    public String getColor() // get for Color
    {
        return color;
    }

    public int getHeight() // get for Height
    {
        return height;
    }

    public double getPrice() // get for Price
    {
        return price;
    }

    public void setColor(String colo) // set for Color
    {
        color = colo;
    }

    public void setHeight(int hi) // set for Height
    {
        height = hi;
        price = hi *2;
    }

}

%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

public class ScentedCandle extends Candle //extends the Candle class
{
    private String scent;
    public String getScent() //get for the Scent
    {
        return scent;
    }

    public void setScent(String aroma) //set for the Scent
    {
        this.scent = aroma; //this ensures we take the given input
    }

    @Override
    public void setHeight(int hi) //override the price based on the height
    {
        super.setHeight(hi);
        price = hi * 3;

    }

}
