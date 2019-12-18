package com.qaulitymeasurment;

public enum VolumeMeasurement {

    LITRE(1), GALLON(3.78), MILLI_LITRE(1d / 1000);

    private final double volumeUnit;

    VolumeMeasurement(double volume) {
        this.volumeUnit = volume;
    }

    public boolean compareVolume(Length v1, Length v2) {
        return (Double.compare(Math.round(v1.value * v1.volume.volumeUnit), Math.round(v2.value * v2.volume.volumeUnit))) == 0;
    }

}
