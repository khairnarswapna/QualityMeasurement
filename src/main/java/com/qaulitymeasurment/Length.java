package com.qaulitymeasurment;

public class Length {

    public UnitMeasurement unit = null;
    public VolumeMeasurement volume = null;
    public final double value;

    public Length(UnitMeasurement unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    public Length(VolumeMeasurement volume, double value) {
        this.volume = volume;
        this.value = value;
    }

    public boolean compareUnit(Length thisQuantity, Length thatQuantity) {
        return this.unit.compareUnits(thisQuantity, thatQuantity);
    }

    public Double addUnit(Length thisQuantity, Length thatQuantity) {
        return this.unit.additionOfUnits(thisQuantity, thatQuantity);
    }

    public boolean compareVolume(Length thisVolume, Length thatVolume) {
        return this.volume.compareVolume(thisVolume, thatVolume);
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
