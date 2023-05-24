package ua.hillel.homework7.calculators;

// Engineer calculator
public class EngCalculator extends SimpleCalculator {

    /**
     * @param angle - value in degree
     * @return sinus of the angle value
     */
    public double sinus(double angle) {
        double radians = Math.PI * angle / 180;
        lastResult = Math.sin(radians);

        return lastResult;
    }
}
