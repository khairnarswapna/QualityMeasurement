package com.qaulitymeasurment;

import static com.qaulitymeasurment.TemperatureMeasurement.FAHRENHEIT;

public class Length {

    public Units unit;
    public final double value;

    public Length(Units unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    public boolean compareUnit(Length thatQuantity) {
        return (Double.compare(Math.round(this.value * this.unit.compareUnits()), Math.round(thatQuantity.value * thatQuantity.unit.compareUnits()))) == 0;
    }

    public long addUnit(Length l2) {
        return Math.round(this.value * this.unit.compareUnits() + l2.value * l2.unit.compareUnits());
    }

    public boolean convertTemperature(Length l2) {
        if (this.unit.equals(FAHRENHEIT))
            return (Double.compare(Math.round((this.value - this.unit.compareUnits()) * 5 / 9), l2.value * l2.unit.compareUnits())) == 0;
        return (Double.compare(Math.round((this.value * this.unit.compareUnits())), l2.value - l2.unit.compareUnits()) * 5 / 9) == 0;
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
