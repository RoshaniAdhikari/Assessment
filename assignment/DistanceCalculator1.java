package assignment;

import java.util.Scanner;
public class DistanceCalculator1 {
    public static void main(String[] args) {
        double u = 36;
        double a = 5;
        double initialVelocityMetersPerSec = u * (1000.0 / 3600.0);
        Scanner scanner = new Scanner(System.in);
        double t1 = scanner.nextDouble();
        double t2 = scanner.nextDouble();
        scanner.close();
        int d1 =(int) calculateDistance(initialVelocityMetersPerSec, a, t1);
        int d2 = (int)calculateDistance(initialVelocityMetersPerSec, a, t2);
        System.out.println(d1);   
        System.out.println(d2);    }
    private static double calculateDistance(double u, double a, double t)
    {
		return u*t+((a*t*t)/2);
    }
}