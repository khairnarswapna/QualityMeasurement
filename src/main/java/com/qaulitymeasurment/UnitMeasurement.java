package com.qaulitymeasurment;

public enum UnitMeasurement {

    FEET(30.48), INCH(2.54), YARD(91.44), CENTIMETER(1.0);

    private final double unitValue;

    UnitMeasurement(double unitValue) {
        this.unitValue = unitValue;
    }

    public boolean compare(Length l1, Length l2) {
        return (Double.compare(l1.value * l1.unit.unitValue, l2.value * l2.unit.unitValue)) == 0;
    }

}