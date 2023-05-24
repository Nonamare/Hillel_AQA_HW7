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
         */
    }
}