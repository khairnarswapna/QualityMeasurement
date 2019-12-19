package com.qaulitymeasurment;

public enum WeightMeasurement {

    KILO_GRAMS(1.0), GRAMS(0.001), TONNE(1000.0);

    private final double weight;

    WeightMeasurement(double weight) {
        this.weight = weight;
    }

    public boolean compareWeight(Length w1, Length w2) {
        return (Double.compare(Math.round(w1.value * w1.weight.weight), Math.round(w2.value * w2.weight.weight))) == 0;
    }

    public double additionOfWeights(Length w1, Length w2) {
        Double weightLength1 = w1.value * w1.weight.weight;
        Double weightLength2 = w2.value * w2.weight.weight;
        double weightLength = weightLength1 + weightLength2;
        return weightLength;
    }

}
