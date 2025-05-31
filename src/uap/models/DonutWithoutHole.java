
package uap.models;

import uap.bases.BaseShape;

public class DonutWithoutHole extends BaseShape {
    private double radius;

    public DonutWithoutHole(double radius) {
        this.radius = radius;
    }

    @Override
    public double getVolume() {
        return 4.0 / 3 * PI * radius * radius * radius;
    }

    @Override
    public double getSurfaceArea() {
        return 4 * PI * radius * radius;
    }

    @Override
    public double getMass() {
        return getVolume() * DENSITY * THICKNESS;
    }

    @Override
    public double getMassKg() {
        return getMass() / 1000;
    }

    @Override
    public int getShippingCost() {
        return (int) Math.ceil(getMassKg()) * 10000;
    }

    @Override
    public void printDetails() {
        System.out.printf("Volume          : %.2f\n", getVolume());
        System.out.printf("Luas permukaan  : %.2f\n", getSurfaceArea());
        System.out.printf("Massa           : %.2f\n", getMass());
        System.out.printf("Massa dalam kg  : %.2f\n", getMassKg());
        System.out.printf("Biaya kirim     : Rp%d\n", getShippingCost());
    }
}
