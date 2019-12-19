package com.qaulitymeasurment;

public enum WeightMeasurement implements Units {

    KILO_GRAMS(1.0), GRAMS(0.001), TONNE(1000.0);

    private final double weight;

    WeightMeasurement(double weight) {
        this.weight = weight;
    }

    @Override
    public double compareUnits() {
        return this.weight;
    }

}
