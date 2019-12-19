package com.qaulitymeasurment;

public enum VolumeMeasurement implements Units {

    LITRE(1), GALLON(3.78), MILLI_LITRE(1d / 1000);

    private final double volumeUnit;

    VolumeMeasurement(double volume) {
        this.volumeUnit = volume;
    }

    @Override
    public double compareUnits() {
        return this.volumeUnit;
    }

}
