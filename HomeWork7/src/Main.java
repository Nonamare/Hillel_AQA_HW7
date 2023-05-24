import ua.hillel.homework7.calculators.*;
import ua.hillel.homework7.shapes.*;

// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        /*
         Part 1

         В класі main створити масив з обєктами фігур
         В циклі викликати методи цих фігур
        */
        Shape[] shapes = new Shape[3];

        Point p1 = new Point(0, 0);
        Point p2 = new Point(0, 5);
        Point p3 = new Point(5, 5);
        Point p4 = new Point(5, 0);

        // В класі main створити масив з обєктами фігур
        shapes[0] = new Triangle(p1, p2, p3);
        shapes[1] = new Rectangle(p1, p2, p3, p4);
        shapes[2] = new Circle(p1, p2);

        // В циклі викликати методи цих фігур
        for (Shape element : shapes) {
            //System.out.println("I'm " + element.getClass().getSimpleName());
            System.out.println(" NOW " + element.getClass().getSimpleName());
            System.out.println("Perimeter is " + element.calculatePerimeter());
            System.out.println("Area is " + element.calculateArea());
            System.out.println("Default color is " + element.color);
            element.paint("Blue!");
            System.out.println("New color is " + element.color);
            System.out.println("toString(): " + element.toString());
            System.out.println("================================");
        }

        // Коректно перевизначити методи equals(), hashCode(), toString().

        // Triangle with the same params
        Triangle anotherTriangle = new Triangle(p1, p2, p3);
        System.out.println("Triangles must be equal");
        System.out.println("Equals: " + shapes[0].equals(anotherTriangle));
        System.out.println("Hash: " + anotherTriangle.hashCode());

        // Triangle with NOT the same params
        Triangle yetAnotherTriangle = new Triangle(p1, p2, p4);
        System.out.println("Triangles must NOT be equal");
        System.out.println("Equals: " + shapes[0].equals(yetAnotherTriangle));
        System.out.println("Hash: " + yetAnotherTriangle.hashCode());


        /*
        Part 2
        реалізувати сімейство калькуляторів (Простий, Фінансовий, Бухгалтерський) Інженерний, Програмований)
        всі вони повинні вміти виконувати базові операції(+,-.*,/ ) плюс свої специфічні функції;

        Simple: +,-.*,/
        Accountant: %
        Financial: USD exchange rate
        Engineer: sin
        Programmin: memory operations (read, set, clear, add a value)
         */

        System.out.println("");
        System.out.println("");
        System.out.println("PART II");
        System.out.println("");
        SimpleCalculator[] calcs = new SimpleCalculator[5];

        calcs[0] = new SimpleCalculator();
        calcs[1] = new AccCalculator();
        calcs[2] = new FinCalculator();
        calcs[3] = new EngCalculator();
        calcs[4] = new ProgCalculator();

        for (SimpleCalculator calc : calcs) {
            System.out.println("Calculator: " + calc.getClass().getSimpleName());
            System.out.println("Add 2 and 3 = " + calc.add(2, 3));
            System.out.println("Sub 2 and 3 = " + calc.substract(2, 3));
            System.out.println("Mult 2 and 3 = " + calc.multiply(2, 3));
            System.out.println("Reread last result " + calc.getLastResult());
            System.out.println("Div 2 and 3 = " + calc.divide(2, 3));
            System.out.println("Reread last result " + calc.getLastResult());
            switch (calc.getClass().getSimpleName()) {
                case "AccCalculator":
                    // %
                    // Using getLastResult() - too complex for test purposes
                    AccCalculator accCalculator = (AccCalculator) calc;
                    accCalculator.percent(200, 20);
                    System.out.println("20 percents of 200 = " + accCalculator.getLastResult());

                    break;
                case "FinCalculator":
                    // getNBURate(currency)
                    FinCalculator finCalculator = (FinCalculator) calc;

                    // EUR - not supported
                    try {
                        finCalculator.getNBURate("EUR");
                    } catch (IllegalArgumentException e) {
                        System.out.println("AHA! No way to get EUR rate. And last result is not changed: " + finCalculator.getLastResult());
                    }

                    finCalculator.getNBURate("USD");
                    System.out.println("NBU USD exchange rate: " + finCalculator.getLastResult());
                    System.out.println("Last result: " + finCalculator.getLastResult());

                    break;

                case "EngCalculator":
                    // sin
                    EngCalculator engCalculator = (EngCalculator) calc;
                    engCalculator.sinus(45);
                    System.out.println("Sin(45) = " + engCalculator.getLastResult());

                    break;

                case "ProgCalculator":
                    // memory operations (read, set, clear, add a value)
                    ProgCalculator progCalculator = (ProgCalculator) calc;
                    System.out.println("Current value on screen: " + progCalculator.getLastResult());
                    System.out.println("Initial memory value: " + progCalculator.memoryRead());
                    progCalculator.add(3, 4);
                    progCalculator.memorySet();
                    System.out.println("Should be 7: " + progCalculator.memoryRead());
                    progCalculator.memoryAdd(3);
                    System.out.println("Should be 10: " + progCalculator.memoryRead());
                    progCalculator.memoryClear();
                    System.out.println("Should be 0: " + progCalculator.memoryRead());

                    break;

                default:
                    System.out.println("Are you simple calculator? Check: " + calc.getClass().getSimpleName());
                    break;


            }

            System.out.println("=======================");
        }
    }
}