public class DemoPhoneCalls
{
    public static void main(String[] args)
    {
        IncomingPhoneCall inCall = new IncomingPhoneCall("212-555-3096");
        OutgoingPhoneCall outCall = new OutgoingPhoneCall("312-874-0232", 10);
        inCall.getInfo();
        outCall.getInfo();
    }
}

%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

public abstract class PhoneCall
{
    String phoneNumber;
    double price;
    public PhoneCall(String num)
    {
        phoneNumber = num;
        //setPrice();
    }
    public void setPrice(double pr)
    {
        price = 0;
    }
    public abstract String getPhoneNumber();
    public abstract double getPrice();
    public abstract void getInfo();
}

%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
  
public class IncomingPhoneCall extends PhoneCall
{
    public final static double RATE = .02;
    public IncomingPhoneCall(String num)
    {
        super(num);
        price = RATE;
    }
    public void getInfo()
    {
        System.out.println("Incoming info: " );
        System.out.println("Phone Number: " + getPhoneNumber() + " Price: " + getPrice() + " Total Rate: " + getPrice()); //
    }
    public String getPhoneNumber()
    {
        return phoneNumber;
    }
    public double getPrice()
    {
        return price;
    }
}

%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

public class OutgoingPhoneCall extends PhoneCall
{
    public final static double RATE = .04;
    private int minutes;
    public OutgoingPhoneCall(String num, int mins)
    {
        super(num);
        minutes = mins;
        price = RATE;

    }
    public void getInfo()
    {
        System.out.println("Outgoing Info: ");
        System.out.println("Phone Number: " + getPhoneNumber() + "  Price: " + getPrice() + " Time: " + minutes + " Total Rate: " + getPrice());                      
    }
    public String getPhoneNumber()
    {
        return phoneNumber;
    }
    public double getPrice()
    {
        return (minutes * price);
    }
}

%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

public class PhoneCallArray
{
    public static void main(String[] args)
    {
        PhoneCall calls[] = new PhoneCall[8];
        int i;
        calls[0] = new IncomingPhoneCall("345-094-8372");
        calls[1] = new OutgoingPhoneCall("644-564-8572", 4);
        calls[2] = new IncomingPhoneCall("343-194-3372");
        calls[3] = new OutgoingPhoneCall("655-999-6372", 10);
        calls[4] = new IncomingPhoneCall("545-065-2362");
        calls[5] = new OutgoingPhoneCall("655-999-6372", 30);
        calls[6] = new IncomingPhoneCall("125-345-4857");
        calls[7] = new OutgoingPhoneCall("235-955-1371", 3);
        for(i = 0; i < calls.length; ++i)
            calls[i].getInfo();
    }
}
