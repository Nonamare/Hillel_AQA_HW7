package ua.hillel.homework7.calculators;

// Programmable calculator
// To be honest, I'm too lazy to implement logic of passing string of operations, etc.
public class ProgCalculator extends SimpleCalculator {
    private double memoryValue;

    public void memorySet() {
        memoryValue = lastResult;
    }

    public void memoryClear() {
        memoryValue = 0;
    }

    /**
     * @return value in memory, overwriting last result
     */
    public double memoryRead() {
        lastResult = memoryValue;
        return memoryValue;
    }

    /**
     * Operates with memory value only. Doesn't affect last result, virtually shown on screen
     *
     * @param value - adds value to the value stored in memory.
     */
    public void memoryAdd(double value) {
        memoryValue += value;
    }

}
