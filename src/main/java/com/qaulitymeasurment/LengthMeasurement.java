package com.qaulitymeasurment;

public enum LengthMeasurement implements Units {

    FEET(12.0), INCH(1.0), YARD(36.0), CENTIMETER(0.393701);

    private final double unitValue;

    LengthMeasurement(double unitValue) {
        this.unitValue = unitValue;
    }

    @Override
    public double compareUnits() {
        return this.unitValue;
    }

}
