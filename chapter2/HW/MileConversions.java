class MileConversions {
    public static void main(String[] abc) 
    {
        final int INCHES_IN_MILE = 63360;
        final int FEET_IN_MILE = 5280;
        final int YARDS_IN_MILE = 1760;
        double miles = 4;

        System.out.print(miles + " miles is ");
        System.out.print(miles * INCHES_IN_MILE + " inches, or ");
        System.out.print(miles * FEET_IN_MILE + " feet, or ");
        System.out.print(miles * YARDS_IN_MILE + " yards");
    }
}
