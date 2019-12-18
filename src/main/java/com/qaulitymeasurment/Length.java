package com.qaulitymeasurment;

public class Length {

    public final UnitMeasurement unit;
    public final double value;

    public Length(UnitMeasurement unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    public boolean compare(Length thisQuantity, Length thatQuantity) {
        return this.unit.compare(thisQuantity, thatQuantity);
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
