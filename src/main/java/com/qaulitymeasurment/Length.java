package com.qaulitymeasurment;

public class Length {

    public UnitMeasurement unit = null;
    public VolumeMeasurement volume = null;
    public WeightMeasurement weight = null;
    public TemperatureMeasurement temperature = null;
    public final double value;

    public Length(UnitMeasurement unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    public Length(VolumeMeasurement volume, double value) {
        this.volume = volume;
        this.value = value;
    }

    public Length(WeightMeasurement weight, double value) {
        this.weight = weight;
        this.value = value;
    }

    public Length(TemperatureMeasurement temperature, double value) {
        this.temperature = temperature;
        this.value = value;
    }

    public boolean compareUnit(Length thisQuantity, Length thatQuantity) {
        return this.unit.compareUnits(thisQuantity, thatQuantity);
    }

    public boolean compareVolume(Length thisVolume, Length thatVolume) {
        return this.volume.compareVolume(thisVolume, thatVolume);
    }

    public boolean compareWeight(Length thisWeight, Length thatWeight) {
        return this.weight.compareWeight(thisWeight, thatWeight);
    }

    public boolean compareTemperature(Length thisTemperature, Length thatTemperature) {
        return this.temperature.compareTemperature(thisTemperature, thatTemperature);
    }

    public Double addUnit(Length thisQuantity, Length thatQuantity) {
        return this.unit.additionOfUnits(thisQuantity, thatQuantity);
    }

    public Double addVolumes(Length thisVolume, Length thatVolume) {
        return this.volume.additionOfVolumes(thisVolume, thatVolume);
    }

    public Double addWeights(Length thisWeight, Length thatWeight) {
        return this.weight.additionOfWeights(thisWeight, thatWeight);
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
