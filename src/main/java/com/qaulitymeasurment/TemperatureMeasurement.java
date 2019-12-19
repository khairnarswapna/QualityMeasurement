package com.qaulitymeasurment;

public enum TemperatureMeasurement implements Units {

    FAHRENHEIT(32.0), CELSIUS(1);

    private final double temperature;

    TemperatureMeasurement(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public double compareUnits() {
        return this.temperature;
    }

}
