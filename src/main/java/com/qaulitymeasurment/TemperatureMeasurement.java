package com.qaulitymeasurment;

public enum TemperatureMeasurement {

    FAHRENHEIT(32.0), CELSIUS(1);

    private final double temperature;

    TemperatureMeasurement(double temperature) {
        this.temperature = temperature;
    }

    public boolean compareTemperature(Length t1, Length t2) {
        return (Double.compare(Math.round((t1.value - t1.temperature.temperature) * 5 / 9), t2.value * t2.temperature.temperature)) == 0;
    }
}
