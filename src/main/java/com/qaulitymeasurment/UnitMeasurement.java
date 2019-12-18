package com.qaulitymeasurment;

public enum UnitMeasurement {

    FEET(12.0), INCH(1.0), YARD(36.0), CENTIMETER(0.393701);

    private final double unitValue;

    UnitMeasurement(double unitValue) {
        this.unitValue = unitValue;
    }

    public boolean compare(Length l1, Length l2) {
        return (Double.compare(Math.round(l1.value * l1.unit.unitValue), Math.round(l2.value * l2.unit.unitValue))) == 0;
    }

}