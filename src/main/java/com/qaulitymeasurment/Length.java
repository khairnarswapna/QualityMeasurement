package com.qaulitymeasurment;

public class Length {


    private static final double FEET_TO_INCH = 12.0;
    private static final double INCH_TO_FEET = 1.0;
    private static final double YARD_PER_FEET = 3.0;
    private static final double YARD_PER_INCH = 36.0;

    enum Unit {
        FEET, INCH, YARD
    }

    private final Unit unit;
    private final double value;

    public Length(Unit unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    public boolean compare(Length thatQuantity) {
        if (this.unit.equals(Unit.FEET) && thatQuantity.unit.equals(Unit.FEET))
            return Double.compare(this.value, thatQuantity.value) == 0;
        if (this.unit.equals(Unit.FEET) && thatQuantity.unit.equals(Unit.INCH))
            return Double.compare(this.value * FEET_TO_INCH, thatQuantity.value) == 0;
        if (this.unit.equals(Unit.INCH) && thatQuantity.unit.equals(Unit.INCH))
            return Double.compare(this.value, thatQuantity.value) == 0;
        if (this.unit.equals(Unit.INCH) && thatQuantity.unit.equals(Unit.FEET))
            return Double.compare(this.value * INCH_TO_FEET, thatQuantity.value * FEET_TO_INCH) == 0;
        if (this.unit.equals(Unit.YARD) && thatQuantity.unit.equals(Unit.FEET))
            return Double.compare(this.value * YARD_PER_FEET, thatQuantity.value) == 0;
        if (this.unit.equals(Unit.YARD) && thatQuantity.unit.equals(Unit.INCH))
            return Double.compare(this.value * YARD_PER_INCH, thatQuantity.value) == 0;
        if (this.unit.equals(Unit.INCH) && thatQuantity.unit.equals(Unit.YARD))
            return Double.compare(this.value, thatQuantity.value * YARD_PER_INCH) == 0;
        return false;
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
