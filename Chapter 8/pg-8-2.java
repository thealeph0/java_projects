import java.util.*;
public class DistanceFromAverage {
    public static void main (String[] args) 
    {
        Scanner key = new Scanner(System.in);
        String value;
        double entry;
        double[] data = new double[15];
        double sum = 0;

        int i=1;

        System.out.print("Enter a numeric value or 99999 to quit >> ");
        value = key.nextLine();
        entry = Double.parseDouble(value);

        if(entry == 99999)
            System.out.print("Enter a value >> ");

        while(entry!= 99999  && i < data.length)
        {
            data[i] = entry;
            sum += entry;
            System.out.print("Enter a numeric value or 99999 to quit >> ");
            value = key.nextLine();
            entry = Double.parseDouble(value);
            
            if(entry == 99999)
            {
                break;
            }
            else
            {
                ++i;
            }

        }

        double avg = sum/i; 
        System.out.print("You have entered " + i + " numbers");
        System.out.println(" and their average is " + avg);
        
        for(int y = 1; y <= i ; ++y)
        {
            double spread = data[y] - avg; 
            System.out.println(data[y] + " is " + spread + " away from the average");
        }
        
        
    }


}
