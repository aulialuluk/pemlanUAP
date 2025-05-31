
package uap.models;

import uap.bases.BaseShape;

public class DonutWithHole extends BaseShape {
    private double outerRadius;
    private double innerRadius;

    public DonutWithHole(double outerRadius, double innerRadius) {
        this.outerRadius = outerRadius;
        this.innerRadius = innerRadius;
    }

    @Override
    public double getVolume() {
        return 2 * PI * PI * outerRadius * innerRadius * innerRadius;
    }

    @Override
    public double getSurfaceArea() {
        return 4 * PI * PI * outerRadius * innerRadius;
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
