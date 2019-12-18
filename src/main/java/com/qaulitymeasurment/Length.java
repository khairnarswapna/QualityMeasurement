package com.qaulitymeasurment;

public class Length {

    private static final double FEET_TO_INCH = 12.0;
    private static final double YARD_PER_INCH = 36.0;

    private final Unit unit;
    private final double value;

    public enum Unit {

        FEET {
            public double getUnitValue(double value) {
                return value * FEET_TO_INCH;
            }
        },
        INCH {
            public double getUnitValue(double value) {
                return value;
            }
        },
        YARD {
            public double getUnitValue(double value) {
                return value * YARD_PER_INCH;
            }
        };

        public abstract double getUnitValue(double value);

    }

    public Length(Unit unit, double value) {
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
