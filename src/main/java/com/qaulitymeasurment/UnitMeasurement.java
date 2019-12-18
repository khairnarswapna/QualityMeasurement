package com.qaulitymeasurment;

public enum UnitMeasurement {

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

    private static final double FEET_TO_INCH = 12.0;
    private static final double YARD_PER_INCH = 36.0;

}