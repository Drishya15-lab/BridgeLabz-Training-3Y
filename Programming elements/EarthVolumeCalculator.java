public class EarthVolumeCalculator {
    public static void main(String[] args) {
        double radiusKm = 6378;
        double pi = Math.PI;

        double volumeKm3 = (4.0 / 3.0) * pi * Math.pow(radiusKm, 3);
        double conversionFactor = Math.pow(1.6, 3); // km³ to mile³
        double volumeMiles3 = volumeKm3 / conversionFactor;

        System.out.println("The volume of earth in cubic kilometers is " + volumeKm3 + " and cubic miles is " + volumeMiles3);
    }
}