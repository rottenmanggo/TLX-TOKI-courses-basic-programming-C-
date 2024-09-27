public class C1_10_AverageSpeedInMiles {
    public static void main(String[] args) {
        double DistanceInKilometer = 14;
        double TimeInMinute = 45;
        double TimeInSecond = 30;
        //I'm using double than integer to get accurate convert value

        double DistanceInMile = DistanceInKilometer * 1.6;
        double TimeInHour = TimeInMinute / 60 + TimeInSecond / 3600;

        double AverageSpeed = DistanceInMile / TimeInHour;
        System.out.println("Average Speed is " + AverageSpeed + " miles per hour");        
    }
}