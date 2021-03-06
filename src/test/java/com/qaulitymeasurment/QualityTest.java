package com.qaulitymeasurment;

import org.junit.Assert;
import org.junit.Test;

public class QualityTest {

    // Unit Measurement
    @Test
    public void given0FeetAnd0Feet_ShouldReturnTrue() {
        QuantityMeasurement feet1 = new QuantityMeasurement(LengthMeasurement.FEET, 0.0);
        QuantityMeasurement feet2 = new QuantityMeasurement(LengthMeasurement.FEET, 0.0);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void given0FeetAnd1Feet_ShouldNotEquals() {
        QuantityMeasurement feet1 = new QuantityMeasurement(LengthMeasurement.FEET, 0.0);
        QuantityMeasurement feet2 = new QuantityMeasurement(LengthMeasurement.FEET, 1.0);
        Assert.assertNotEquals(feet1, feet2);
    }

    @Test
    public void givenNullFeetAnd1Feet_ShouldNotEquals() {
        QuantityMeasurement feet1 = new QuantityMeasurement(LengthMeasurement.FEET, 0.0);
        QuantityMeasurement feet2 = null;
        Assert.assertNotEquals(feet1, feet2);
    }

    @Test
    public void given0FeetAndNullFeet_ShouldNotEquals() {
        QuantityMeasurement feet1 = null;
        QuantityMeasurement feet2 = new QuantityMeasurement(LengthMeasurement.FEET, 0.0);
        Assert.assertNotEquals(feet1, feet2);
    }

    @Test
    public void givenNullFeetAndNullFeet_ShouldNotEquals() {
        QuantityMeasurement feet1 = null;
        QuantityMeasurement feet2 = null;
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void given1FeetAndAnotherClassObject_ShouldNotEquals() {
        QuantityMeasurement feet1 = new QuantityMeasurement(LengthMeasurement.FEET, 0.0);
        Integer feet2 = 10;
        boolean result = feet1.equals(feet2);
        Assert.assertFalse(result);
    }

    @Test
    public void given1FeetEquals1Feet_ShouldReturnTrue() {
        QuantityMeasurement feet1 = new QuantityMeasurement(LengthMeasurement.FEET, 0.0);
        boolean result = feet1.equals(feet1);
        Assert.assertTrue(result);
    }

    @Test
    public void given0InchAnd0Inch_ShouldReturnTrue() {
        QuantityMeasurement inch1 = new QuantityMeasurement(LengthMeasurement.INCH, 0.0);
        QuantityMeasurement inch2 = new QuantityMeasurement(LengthMeasurement.INCH, 0.0);
        Assert.assertEquals(inch1, inch2);
    }

    @Test
    public void given0InchAnd1Inch_ShouldNotEquals() {
        QuantityMeasurement inch1 = new QuantityMeasurement(LengthMeasurement.INCH, 0.0);
        QuantityMeasurement inch2 = new QuantityMeasurement(LengthMeasurement.INCH, 1.0);
        Assert.assertNotEquals(inch1, inch2);
    }

    @Test
    public void givenNullInchAnd1Inch_ShouldNotEquals() {
        QuantityMeasurement inch1 = new QuantityMeasurement(LengthMeasurement.INCH, 0.0);
        QuantityMeasurement inch2 = null;
        Assert.assertNotEquals(inch1, inch2);
    }

    @Test
    public void given0InchAndNullInch_ShouldNotEquals() {
        QuantityMeasurement inch1 = null;
        QuantityMeasurement inch2 = new QuantityMeasurement(LengthMeasurement.INCH, 0.0);
        Assert.assertNotEquals(inch1, inch2);
    }

    @Test
    public void givenNullInchAndNullInch_ShouldNotEquals() {
        QuantityMeasurement inch1 = null;
        QuantityMeasurement inch2 = null;
        Assert.assertEquals(inch1, inch2);
    }

        @Test
    public void given1InchAndAnotherClassObject_ShouldNotEquals() {
        QuantityMeasurement inch1 = new QuantityMeasurement(LengthMeasurement.INCH, 0.0);
        Integer inch2 = 10;
        boolean result = inch1.equals(inch2);
        Assert.assertFalse(result);
    }

    @Test
    public void given1InchEquals1Inch_ShouldReturnTrue() {
        QuantityMeasurement inch1 = new QuantityMeasurement(LengthMeasurement.INCH, 0.0);
        boolean result = inch1.equals(inch1);
        Assert.assertTrue(result);
    }

    @Test
    public void given1FeetAnd1Inch_ShouldNotEquals() {
        QuantityMeasurement feet = new QuantityMeasurement(LengthMeasurement.FEET, 1.0);
        QuantityMeasurement inch = new QuantityMeasurement(LengthMeasurement.INCH, 1.0);
        Assert.assertNotEquals(feet, inch);
    }

    @Test
    public void given0FeetAnd0Inch_ShouldReturnEqualLength() {
        QuantityMeasurement feet = new QuantityMeasurement(LengthMeasurement.FEET, 0.0);
        QuantityMeasurement inch = new QuantityMeasurement(LengthMeasurement.INCH, 0.0);
        boolean compareCheck = feet.compareUnit(inch);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1FeetAnd1Inch_ShouldReturnNotEqualLength() {
        QuantityMeasurement feet = new QuantityMeasurement(LengthMeasurement.FEET, 1.0);
        QuantityMeasurement inch = new QuantityMeasurement(LengthMeasurement.INCH, 1.0);
        boolean compareCheck = feet.compareUnit(inch);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1FeetAnd1Feet_ShouldReturnEqualLength() {
        QuantityMeasurement feet1 = new QuantityMeasurement(LengthMeasurement.FEET, 1.0);
        QuantityMeasurement feet2 = new QuantityMeasurement(LengthMeasurement.FEET, 1.0);
        boolean compareCheck = feet1.compareUnit(feet2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1InchAnd1Inch_ShouldReturnEqualLength() {
        QuantityMeasurement inch1 = new QuantityMeasurement(LengthMeasurement.INCH, 1.0);
        QuantityMeasurement inch2 = new QuantityMeasurement(LengthMeasurement.INCH, 1.0);
        boolean compareCheck = inch1.compareUnit(inch2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given12InchAnd1Feet_ShouldReturnNotEqualLength() {
        QuantityMeasurement inch = new QuantityMeasurement(LengthMeasurement.INCH, 12.0);
        QuantityMeasurement feet = new QuantityMeasurement(LengthMeasurement.FEET, 1.0);
        boolean compareCheck = inch.compareUnit(feet);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given3FeetAnd1Yard_ShouldReturnEqualLength() {
        QuantityMeasurement yard = new QuantityMeasurement(LengthMeasurement.YARD, 1.0);
        QuantityMeasurement feet = new QuantityMeasurement(LengthMeasurement.FEET, 3.0);
        boolean compareCheck = yard.compareUnit(feet);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1FeetAnd3Yard_ShouldReturnNotEqualLength() {
        QuantityMeasurement yard = new QuantityMeasurement(LengthMeasurement.YARD, 3.0);
        QuantityMeasurement feet = new QuantityMeasurement(LengthMeasurement.FEET, 1.0);
        boolean compareCheck = yard.compareUnit(feet);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1InchAnd1Yard_ShouldReturnNotEqualLength() {
        QuantityMeasurement yard = new QuantityMeasurement(LengthMeasurement.YARD, 1.0);
        QuantityMeasurement inch = new QuantityMeasurement(LengthMeasurement.INCH, 1.0);
        boolean compareCheck = yard.compareUnit(inch);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1YardAnd36Inch_ShouldReturnEqualLength() {
        QuantityMeasurement yard = new QuantityMeasurement(LengthMeasurement.YARD, 1.0);
        QuantityMeasurement inch = new QuantityMeasurement(LengthMeasurement.INCH, 36.0);
        boolean compareCheck = yard.compareUnit(inch);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given36InchAnd1Yard_ShouldReturnEqualLength() {
        QuantityMeasurement inch = new QuantityMeasurement(LengthMeasurement.INCH, 36.0);
        QuantityMeasurement yard = new QuantityMeasurement(LengthMeasurement.YARD, 1.0);
        boolean compareCheck = inch.compareUnit(yard);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1YardAnd3Feet_ShouldReturnEqualLength() {
        QuantityMeasurement yard = new QuantityMeasurement(LengthMeasurement.YARD, 1.0);
        QuantityMeasurement feet = new QuantityMeasurement(LengthMeasurement.FEET, 3.0);
        boolean compareCheck = yard.compareUnit(feet);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1CentimeterAnd1Centimeter_ShouldReturnEqualLength() {
        QuantityMeasurement centimeter1 = new QuantityMeasurement(LengthMeasurement.CENTIMETER, 2.0);
        QuantityMeasurement centimeter2 = new QuantityMeasurement(LengthMeasurement.CENTIMETER, 2.0);
        boolean compareCheck = centimeter1.compareUnit(centimeter2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given2InchAnd5Centimeter_ShouldReturnEqualLength() {
        QuantityMeasurement inch = new QuantityMeasurement(LengthMeasurement.INCH, 2.0);
        QuantityMeasurement centimeter = new QuantityMeasurement(LengthMeasurement.CENTIMETER, 5.0);
        boolean compareCheck = inch.compareUnit(centimeter);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given5CentimeterAnd2Inch_ShouldReturnEqualLength() {
        QuantityMeasurement centimeter = new QuantityMeasurement(LengthMeasurement.CENTIMETER, 5.0);
        QuantityMeasurement inch = new QuantityMeasurement(LengthMeasurement.INCH, 1.968505);
        boolean compareCheck = centimeter.compareUnit(inch);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given5CentimeterAnd3Inch_ShouldReturnNotEqualLength() {
        QuantityMeasurement centimeter = new QuantityMeasurement(LengthMeasurement.CENTIMETER, 5.08);
        QuantityMeasurement inch = new QuantityMeasurement(LengthMeasurement.INCH, 3.0);
        boolean compareCheck = centimeter.compareUnit(inch);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given2InchAnd2Inch_ShouldReturnAdditionInInch() {
        QuantityMeasurement inch1 = new QuantityMeasurement(LengthMeasurement.INCH, 2.0);
        QuantityMeasurement inch2 = new QuantityMeasurement(LengthMeasurement.INCH, 2.0);
        double compareAddition = inch1.addUnit(inch2);
        Assert.assertEquals(compareAddition, 4, 0.0);
    }

    @Test
    public void given1FeetAnd2Inch_ShouldReturnAdditionInInch() {
        QuantityMeasurement feet = new QuantityMeasurement(LengthMeasurement.FEET, 1.0);
        QuantityMeasurement inch = new QuantityMeasurement(LengthMeasurement.INCH, 2.0);
        double compareAddition = feet.addUnit(inch);
        Assert.assertEquals(compareAddition, 14, 0.0);
    }

    @Test
    public void given1FeetAnd1Feet_ShouldReturnAdditionInInch() {
        QuantityMeasurement feet1 = new QuantityMeasurement(LengthMeasurement.FEET, 1.0);
        QuantityMeasurement feet2 = new QuantityMeasurement(LengthMeasurement.FEET, 1.0);
        double compareAddition = feet1.addUnit(feet2);
        Assert.assertEquals(compareAddition, 24, 0.0);
    }

    @Test
    public void given2InchAnd2_5Centimeter_ShouldReturnAdditionInInch() {
        QuantityMeasurement inch = new QuantityMeasurement(LengthMeasurement.INCH, 2.0);
        QuantityMeasurement centimeter = new QuantityMeasurement(LengthMeasurement.CENTIMETER, 2.5);
        double compareAddition = inch.addUnit(centimeter);
        Assert.assertEquals(compareAddition, 3, 0.0);
    }

    // Volume Measurement
    @Test
    public void given1GallonAnd3_78Litre_ShouldReturnEquals() {
        QuantityMeasurement gallon = new QuantityMeasurement(VolumeMeasurement.GALLON, 1.0);
        QuantityMeasurement litre = new QuantityMeasurement(VolumeMeasurement.LITRE, 3.78);
        boolean compareCheck = gallon.compareUnit(litre);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1LitreAnd1000ML_ShouldReturnEquals() {
        QuantityMeasurement litre = new QuantityMeasurement(VolumeMeasurement.LITRE, 1.0);
        QuantityMeasurement milliLitre = new QuantityMeasurement(VolumeMeasurement.MILLI_LITRE, 1000.0);
        boolean compareCheck = litre.compareUnit(milliLitre);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1GallonAnd3_78Litre_ShouldReturnAdditionInLitres() {

        QuantityMeasurement gallon = new QuantityMeasurement(VolumeMeasurement.GALLON, 1.0);
        QuantityMeasurement litre = new QuantityMeasurement(VolumeMeasurement.LITRE, 3.78);
        double compareAddition = gallon.addUnit(litre);
        Assert.assertEquals(compareAddition, 8.0, 0.0);
    }

    @Test
    public void given1LitreAnd1000ML_ShouldReturnAdditionInLitres() {
        QuantityMeasurement litre = new QuantityMeasurement(VolumeMeasurement.LITRE, 1.0);
        QuantityMeasurement millilitre = new QuantityMeasurement(VolumeMeasurement.MILLI_LITRE, 1000.0);
        double compareAddition = litre.addUnit(millilitre);
        Assert.assertEquals(compareAddition, 2.0, 0.0);
    }

    // Weight Measurement
    @Test
    public void given1KiloGramAnd1000Grams_ShouldReturnEquals() {
        QuantityMeasurement kilograms = new QuantityMeasurement(WeightMeasurement.KILO_GRAMS, 1.0);
        QuantityMeasurement grams = new QuantityMeasurement(WeightMeasurement.GRAMS, 1000.0);
        boolean compareCheck = kilograms.compareUnit(grams);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1TonneAnd1000KiloGrams_ShouldReturnEquals() {
        QuantityMeasurement tonnes = new QuantityMeasurement(WeightMeasurement.TONNE, 1.0);
        QuantityMeasurement kilograms = new QuantityMeasurement(WeightMeasurement.KILO_GRAMS, 1000.0);
        boolean compareCheck = tonnes.compareUnit(kilograms);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1TonneAnd1000Grams_ShouldReturnAdditionInKiloGrams() {
        QuantityMeasurement tonne = new QuantityMeasurement(WeightMeasurement.TONNE, 1.0);
        QuantityMeasurement grams = new QuantityMeasurement(WeightMeasurement.GRAMS, 1000.0);
        double compareAddition = tonne.addUnit(grams);
        Assert.assertEquals(compareAddition, 1001.0, 0.0);
    }

    // Temperature Measurement
    @Test
    public void given212FahrenheitAnd100Celsius_ShouldReturnEquals() {
        QuantityMeasurement fahrenheit = new QuantityMeasurement(TemperatureMeasurement.FAHRENHEIT, 212.0);
        QuantityMeasurement celsius = new QuantityMeasurement(TemperatureMeasurement.CELSIUS, 100.0);
        boolean compareCheck = fahrenheit.convertTemperature(celsius);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given100CelsiusAnd212Fahrenheit_ShouldReturnEquals() {
        QuantityMeasurement celsius = new QuantityMeasurement(TemperatureMeasurement.CELSIUS, 100.0);
        QuantityMeasurement fahrenheit = new QuantityMeasurement(TemperatureMeasurement.FAHRENHEIT, 212.0);
        boolean compareCheck = celsius.convertTemperature(fahrenheit);
        Assert.assertTrue(compareCheck);
    }

}
