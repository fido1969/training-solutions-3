package methodstructure.bmi;

import static java.lang.Math.pow;

public class BodyMass {
    private double weight;
    private double height;

    public BodyMass(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public double bodyMassIndex() {
        return weight / pow(height, 2);
    }

    public BmiCategory body() {
        if (bodyMassIndex() < 18.5) {
            return BmiCategory.UNDERWEIGHT;
        } else if (bodyMassIndex() > 25) {
            return BmiCategory.OVERWEIGHT;
        } else {
            return BmiCategory.NORMAL;
        }

    }

    public boolean isThinnerThan(BodyMass bm) {
        return (this.bodyMassIndex() < bm.bodyMassIndex());
    }
}
