public class C1_12_AverageSpeedInKilometers {
    public static void main(String[] args) {
        double DistanceInMile = 24;
        int TimeInHour = 1;
        int TimeInMinute = 40;
        int TimeInSecond = 35;

        double DistanceInKilometer = DistanceInMile * 1.6;
        double TotalTimeInHour = TimeInHour + TimeInMinute / 60 + TimeInSecond / 3600;

        double AverageSpeed = DistanceInKilometer / TotalTimeInHour;
        System.out.println("Average Speed is " + AverageSpeed + " miles per hour");
    }
}
