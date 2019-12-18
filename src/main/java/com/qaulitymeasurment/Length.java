package com.qaulitymeasurment;

public class Length {

    private final UnitMeasurement unit;
    private final double value;

    public Length(UnitMeasurement unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    public boolean compare(Length thatQuantity) {
        Double thisValue = this.unit.getUnitValue(this.value);
        Double thatQuantityValue = thatQuantity.unit.getUnitValue(thatQuantity.value);
        return thisValue.equals(thatQuantityValue);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Length)) {
            return false;
        }
        Length length = (Length) o;
        return Double.compare(length.value, value) == 0 &&
                unit == length.unit;
    }

}
