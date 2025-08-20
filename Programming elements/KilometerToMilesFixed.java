public class KilometerToMilesFixed {
    public static void main(String[] args) {
        double distanceKm = 10.8;
        double conversionFactor = 1.6;

        double distanceMiles = distanceKm / conversionFactor;

        System.out.println("The distance " + distanceKm + " km in miles is " + distanceMiles);
    }
}


