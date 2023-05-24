package ua.hillel.homework7.calculators;

// Accountant calculator
public class AccCalculator extends SimpleCalculator {

    /**
     * @param value   - original value
     * @param percent - percents (100 means 100%)
     * @return returns percents from value
     */
    public double percent(double value, int percent) {
        lastResult = value * ((double) percent / 100);

        return lastResult;
    }
}
