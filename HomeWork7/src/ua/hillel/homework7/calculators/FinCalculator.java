package ua.hillel.homework7.calculators;


// Financial calculator
public class FinCalculator extends SimpleCalculator {

    /**
     * @param currency - actually, USD only is supported
     * @return returns NBU rate for USD/UAH. For the period of war it's strictly 36.6
     */
    public double getNBURate(String currency) throws IllegalArgumentException {
        if (!currency.equals("USD")) {
            throw new IllegalArgumentException("USD ONLY!");
        }

        lastResult = 36.6;
        return lastResult;
    }
}
