package com.qaulitymeasurment;

import org.junit.Assert;
import org.junit.Test;

public class QualityTest {


    @Test
    public void given0FeetAnd0Feet_ShouldReturnTrue() {
        Length feet1 = new Length(UnitMeasurement.FEET, 0.0);
        Length feet2 = new Length(UnitMeasurement.FEET, 0.0);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void given0FeetAnd1Feet_ShouldNotEquals() {
        Length feet1 = new Length(UnitMeasurement.FEET, 0.0);
        Length feet2 = new Length(UnitMeasurement.FEET, 1.0);
        Assert.assertNotEquals(feet1, feet2);
    }

    @Test
    public void givenNullFeetAnd1Feet_ShouldNotEquals() {
        Length feet1 = new Length(UnitMeasurement.FEET, 0.0);
        Length feet2 = null;
        Assert.assertNotEquals(feet1, feet2);
    }

    @Test
    public void given0FeetAndNullFeet_ShouldNotEquals() {
        Length feet1 = null;
        Length feet2 = new Length(UnitMeasurement.FEET, 0.0);
        Assert.assertNotEquals(feet1, feet2);
    }

    @Test
    public void givenNullFeetAndNullFeet_ShouldNotEquals() {
        Length feet1 = null;
        Length feet2 = null;
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void given1FeetAndAnotherClassObject_ShouldNotEquals() {
        Length feet1 = new Length(UnitMeasurement.FEET, 0.0);
        Integer feet2 = 10;
        boolean result = feet1.equals(feet2);
        Assert.assertFalse(result);
    }

    @Test
    public void given1FeetEquals1Feet_ShouldReturnTrue() {
        Length feet1 = new Length(UnitMeasurement.FEET, 0.0);
        boolean result = feet1.equals(feet1);
        Assert.assertTrue(result);
    }

    @Test
    public void given0InchAnd0Inch_ShouldReturnTrue() {
        Length inch1 = new Length(UnitMeasurement.INCH, 0.0);
        Length inch2 = new Length(UnitMeasurement.INCH, 0.0);
        Assert.assertEquals(inch1, inch2);
    }

    @Test
    public void given0InchAnd1Inch_ShouldNotEquals() {
        Length inch1 = new Length(UnitMeasurement.INCH, 0.0);
        Length inch2 = new Length(UnitMeasurement.INCH, 1.0);
        Assert.assertNotEquals(inch1, inch2);
    }

    @Test
    public void givenNullInchAnd1Inch_ShouldNotEquals() {
        Length inch1 = new Length(UnitMeasurement.INCH, 0.0);
        Length inch2 = null;
        Assert.assertNotEquals(inch1, inch2);
    }

    @Test
    public void given0InchAndNullInch_ShouldNotEquals() {
        Length inch1 = null;
        Length inch2 = new Length(UnitMeasurement.INCH, 0.0);
        Assert.assertNotEquals(inch1, inch2);
    }

    @Test
    public void givenNullInchAndNullInch_ShouldNotEquals() {
        Length inch1 = null;
        Length inch2 = null;
        Assert.assertEquals(inch1, inch2);
    }

    @Test
    public void given1InchAndAnotherClassObject_ShouldNotEquals() {
        Length inch1 = new Length(UnitMeasurement.INCH, 0.0);
        Integer inch2 = 10;
        boolean result = inch1.equals(inch2);
        Assert.assertFalse(result);
    }

    @Test
    public void given1InchEquals1Inch_ShouldReturnTrue() {
        Length inch1 = new Length(UnitMeasurement.INCH, 0.0);
        boolean result = inch1.equals(inch1);
        Assert.assertTrue(result);
    }

    @Test
    public void given1FeetAnd1Inch_ShouldNotEquals() {
        Length feet = new Length(UnitMeasurement.FEET, 1.0);
        Length inch = new Length(UnitMeasurement.INCH, 1.0);
        Assert.assertNotEquals(feet, inch);
    }

    @Test
    public void given0FeetAnd0Inch_ShouldReturnEqualLength() {
        Length feet = new Length(UnitMeasurement.FEET, 0.0);
        Length inch = new Length(UnitMeasurement.INCH, 0.0);
        boolean compareCheck = feet.compareUnit(feet, inch);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1FeetAnd1Inch_ShouldReturnNotEqualLength() {
        Length feet = new Length(UnitMeasurement.FEET, 1.0);
        Length inch = new Length(UnitMeasurement.INCH, 1.0);
        boolean compareCheck = feet.compareUnit(feet, inch);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1FeetAnd1Feet_ShouldReturnEqualLength() {
        Length feet1 = new Length(UnitMeasurement.FEET, 1.0);
        Length feet2 = new Length(UnitMeasurement.FEET, 1.0);
        boolean compareCheck = feet1.compareUnit(feet1, feet2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1InchAnd1Inch_ShouldReturnEqualLength() {
        Length inch1 = new Length(UnitMeasurement.INCH, 1.0);
        Length inch2 = new Length(UnitMeasurement.INCH, 1.0);
        boolean compareCheck = inch1.compareUnit(inch1, inch2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given12InchAnd1Feet_ShouldReturnNotEqualLength() {
        Length inch = new Length(UnitMeasurement.INCH, 12.0);
        Length feet = new Length(UnitMeasurement.FEET, 1.0);
        boolean compareCheck = inch.compareUnit(inch, feet);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given3FeetAnd1Yard_ShouldReturnEqualLength() {
        Length yard = new Length(UnitMeasurement.YARD, 1.0);
        Length feet = new Length(UnitMeasurement.FEET, 3.0);
        boolean compareCheck = yard.compareUnit(yard, feet);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1FeetAnd3Yard_ShouldReturnNotEqualLength() {
        Length yard = new Length(UnitMeasurement.YARD, 3.0);
        Length feet = new Length(UnitMeasurement.FEET, 1.0);
        boolean compareCheck = yard.compareUnit(yard, feet);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1InchAnd1Yard_ShouldReturnNotEqualLength() {
        Length yard = new Length(UnitMeasurement.YARD, 1.0);
        Length inch = new Length(UnitMeasurement.INCH, 1.0);
        boolean compareCheck = yard.compareUnit(yard, inch);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1YardAnd36Inch_ShouldReturnEqualLength() {
        Length yard = new Length(UnitMeasurement.YARD, 1.0);
        Length inch = new Length(UnitMeasurement.INCH, 36.0);
        boolean compareCheck = yard.compareUnit(yard, inch);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given36InchAnd1Yard_ShouldReturnEqualLength() {
        Length inch = new Length(UnitMeasurement.INCH, 36.0);
        Length yard = new Length(UnitMeasurement.YARD, 1.0);
        boolean compareCheck = inch.compareUnit(inch, yard);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1YardAnd3Feet_ShouldReturnEqualLength() {
        Length yard = new Length(UnitMeasurement.YARD, 1.0);
        Length feet = new Length(UnitMeasurement.FEET, 3.0);
        boolean compareCheck = yard.compareUnit(yard, feet);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1CentimeterAnd1Centimeter_ShouldReturnEqualLength() {
        Length centimeter1 = new Length(UnitMeasurement.CENTIMETER, 2.0);
        Length centimeter2 = new Length(UnitMeasurement.CENTIMETER, 2.0);
        boolean compareCheck = centimeter1.compareUnit(centimeter1, centimeter2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given2InchAnd5Centimeter_ShouldReturnEqualLength() {
        Length inch = new Length(UnitMeasurement.INCH, 2.0);
        Length centimeter = new Length(UnitMeasurement.CENTIMETER, 5.0);
        boolean compareCheck = inch.compareUnit(inch, centimeter);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given5CentimeterAnd2Inch_ShouldReturnEqualLength() {
        Length centimeter = new Length(UnitMeasurement.CENTIMETER, 5.0);
        Length inch = new Length(UnitMeasurement.INCH, 1.968505);
        boolean compareCheck = centimeter.compareUnit(centimeter, inch);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given5CentimeterAnd3Inch_ShouldReturnNotEqualLength() {
        Length centimeter = new Length(UnitMeasurement.CENTIMETER, 5.08);
        Length inch = new Length(UnitMeasurement.INCH, 3.0);
        boolean compareCheck = centimeter.compareUnit(centimeter, inch);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given2InchAnd2Inch_ShouldReturnAdditionInInch() {
        Length inch1 = new Length(UnitMeasurement.INCH, 2.0);
        Length inch2 = new Length(UnitMeasurement.INCH, 2.0);
        double compareAddition = inch1.addUnit(inch1, inch2);
        Assert.assertEquals(compareAddition, 4, 0.0);
    }

    @Test
    public void given1FeetAnd2Inch_ShouldReturnAdditionInInch() {
        Length feet = new Length(UnitMeasurement.FEET, 1.0);
        Length inch = new Length(UnitMeasurement.INCH, 2.0);
        double compareAddition = feet.addUnit(feet, inch);
        Assert.assertEquals(compareAddition, 14, 0.0);
    }

    @Test
    public void given1FeetAnd1Feet_ShouldReturnAdditionInInch() {
        Length feet1 = new Length(UnitMeasurement.FEET, 1.0);
        Length feet2 = new Length(UnitMeasurement.FEET, 1.0);
        double compareAddition = feet1.addUnit(feet1, feet2);
        Assert.assertEquals(compareAddition, 24, 0.0);
    }

    @Test
    public void given2InchAnd2_5Centimeter_ShouldReturnAdditionInInch() {
        Length inch = new Length(UnitMeasurement.INCH, 2.0);
        Length centimeter = new Length(UnitMeasurement.CENTIMETER, 2.5);
        double compareAddition = inch.addUnit(inch, centimeter);
        Assert.assertEquals(compareAddition, 3, 0.0);
    }

    @Test
    public void given1GallonAnd3_78Litre_ShouldReturnEquals() {
        Length gallon = new Length(VolumeMeasurement.GALLON, 1.0);
        Length litre = new Length(VolumeMeasurement.LITRE, 3.78);
        boolean compareCheck = gallon.compareVolume(gallon, litre);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1LitreAnd1000ML_ShouldReturnEquals() {
        Length litre = new Length(VolumeMeasurement.LITRE, 1.0);
        Length milliLitre = new Length(VolumeMeasurement.MILLI_LITRE, 1000.0);
        boolean compareCheck = litre.compareVolume(litre, milliLitre);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1GallonAnd3_78Litre_ShouldReturnAdditionInLitres() {

        Length gallon = new Length(VolumeMeasurement.GALLON, 1.0);
        Length litre = new Length(VolumeMeasurement.LITRE, 3.78);
        double compareAddition = gallon.addVolumes(gallon, litre);
        Assert.assertEquals(compareAddition, 7.56, 0.0);
    }

    @Test
    public void given1LitreAnd1000ML_ShouldReturnAdditionInLitres() {
        Length litre = new Length(VolumeMeasurement.LITRE, 1.0);
        Length millilitre = new Length(VolumeMeasurement.MILLI_LITRE, 1000.0);
        double compareAddition = litre.addVolumes(litre, millilitre);
        Assert.assertEquals(compareAddition, 2.0, 0.0);
    }

    @Test
    public void given1KiloGramAnd1000Grams_ShouldReturnEquals() {
        Length kilograms = new Length(WeightMeasurement.KILO_GRAMS, 1.0);
        Length grams = new Length(WeightMeasurement.GRAMS, 1000.0);
        boolean compareCheck = kilograms.compareWeight(kilograms, grams);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1TonneAnd1000KiloGrams_ShouldReturnEquals() {
        Length tonnes = new Length(WeightMeasurement.TONNE, 1.0);
        Length kilograms = new Length(WeightMeasurement.KILO_GRAMS, 1000.0);
        boolean compareCheck = tonnes.compareWeight(tonnes, kilograms);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1TonneAnd1000Grams_ShouldReturnAdditionInKiloGrams() {
        Length tonne = new Length(WeightMeasurement.TONNE, 1.0);
        Length grams = new Length(WeightMeasurement.GRAMS, 1000.0);
        double compareAddition = tonne.addWeights(tonne, grams);
        Assert.assertEquals(compareAddition, 1001.0, 0.0);
    }

    @Test
    public void given212FahrenheitAnd100Celsius_ShouldReturnEquals() {
        Length fahrenheit = new Length(TemperatureMeasurement.FAHRENHEIT, 212.0);
        Length celsius = new Length(TemperatureMeasurement.CELSIUS, 100.0);
        boolean compareCheck = fahrenheit.compareTemperature(fahrenheit, celsius);
        Assert.assertTrue(compareCheck);
    }

}
