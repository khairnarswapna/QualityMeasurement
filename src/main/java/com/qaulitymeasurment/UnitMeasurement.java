package com.qaulitymeasurment;

public enum UnitMeasurement {

    FEET(12.0), INCH(1.0), YARD(36.0), CENTIMETER(0.393701);

    private final double unitValue;

    UnitMeasurement(double unitValue) {
        this.unitValue = unitValue;
    }

    public boolean compareUnits(Length l1, Length l2) {
        return (Double.compare(Math.round(l1.value * l1.unit.unitValue), Math.round(l2.value * l2.unit.unitValue))) == 0;
    }

    public double additionOfUnits(Length l1, Length l2) {
        Double unitLength1 = l1.value * l1.unit.unitValue;
        Double unitLength2 = l2.value * l2.unit.unitValue;
        double unitLength = unitLength1 + unitLength2;
        return Math.round(unitLength);
    }

}