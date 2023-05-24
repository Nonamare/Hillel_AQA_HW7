package ua.hillel.homework7.calculators;

public class SimpleCalculator {

    double lastResult;

    public double getLastResult() {
        return lastResult;
    }

    public double add(double param1, double param2) {
        lastResult = param1 + param2;
        return lastResult;
    }

    public double substract(double param1, double param2) {
        lastResult = param1 - param2;
        return lastResult;
    }

    public double multiply(double param1, double param2) {
        lastResult = param1 * param2;
        return lastResult;
    }

    public double divide(double param1, double param2) {
        lastResult = param1 / param2;
        return lastResult;
    }
}
