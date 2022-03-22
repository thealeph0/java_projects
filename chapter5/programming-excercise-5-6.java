import java.util.*;
public class AcmePay {
    public static void main(String[] args) throws Exception 
    {
        int retire = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter shift - 1 , 2 , or 3");
        int shift = input.nextInt();

        System.out.println("Please enter hours worked");
        double hours = input.nextDouble();

        if(shift != 1)
        {
        System.out.println("Do you want to participate in the retirement plan? \n Enter 1 for Yes and 2 for No");
        retire = input.nextInt();
        }

        double rate = payRate(shift);
        double gross = grossPay(rate, hours);
        
        System.out.println("Hours worked is " + hours);
        System.out.println("Hourly pay rate is " + rate);
        hoursBreakdown(rate, hours);
        retirementPay(shift, retire, gross);
    }

    public static double payRate(int shift)
    {
        double rate = 0;

        if(shift == 1)
        {
            rate = 17;
        }

        else if(shift == 2)
        {
            rate = 18.50;
        }

        else if(shift == 3)
        {
            rate = 22;
        }
    return rate;
    }

    public static void hoursBreakdown(double rate, double hours)
    {
        double pay = 0;
        double standard = 0;
        double overtime = 0;

        if(hours <= 40)
        {
            standard = rate * hours;
        }

        else if(hours>40)
        {
            standard = rate * 40;
            overtime = 1.5 * rate * (hours-40);
        }

            System.out.println("Your regular pay is " + standard);
            System.out.println("Overtime pay is " + overtime);
    }

    public static double grossPay(double rate, double hours)
    {
        double pay = 0;
        double standard = 0;
        double overtime = 0;

        if(hours <= 40)
        {
            pay = rate * hours;
        }

        else if(hours>40)
        {
            standard = rate * 40;
            overtime = 1.5 * rate * (hours-40);
            pay = standard + overtime;
        }

        return pay;
    }

    public static void retirementPay(int shift ,int choice, double gross)
    {
        double retire = 0;
        double netPay = 0;

        if(shift != 1 && choice == 1)
        {
            retire = gross * (0.03);
            netPay = gross * (0.97);
        }
        else if(shift == 1 || choice != 1)
        {
            netPay = gross;
        }

        System.out.println("Retirment Deduction is " + retire);
        System.out.println("Net Pay is ...................." + netPay);
    }
}
