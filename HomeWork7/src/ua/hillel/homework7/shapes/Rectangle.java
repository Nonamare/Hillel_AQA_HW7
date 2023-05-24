package ua.hillel.homework7.shapes;

public class Rectangle extends Shape {

    private Point p1, p2, p3, p4;
    public Segment side1, side2, side3, side4;

    /**
     * Note: points must be specified one-by-one, not in random order
     * @param apex1 - first apex
     * @param apex2 - second apex
     * @param apex3 - third apex
     * @param apex4 - forth apex
     */
    public Rectangle(Point apex1, Point apex2, Point apex3, Point apex4) {
        p1 = apex1;
        p2 = apex2;
        p3 = apex3;
        p4 = apex4;

        side1 = new Segment(p1, p2);
        side2 = new Segment(p2, p3);
        side3 = new Segment(p3, p4);
        side4 = new Segment(p4, p1);

        color = "Transparent";

        shapeName = "Rectangle";
    }

    @Override
    public double calculatePerimeter() {
        // For debugging purposes I do it step-by-step

        double perimeter = side1.length();
        perimeter += side2.length();
        perimeter += side3.length();
        perimeter += side4.length();

        return perimeter;
    }

    /**
     * We DO believe it's rectangle, not just quadrilateral.
     * Don't cheat us!
     * @return double
     */
    @Override
    public double calculateArea() {
        /*
         Area = length x width
         */

        return side1.length() * side2.length();
    }

    @Override
    public void paint(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        // Comparison
        // By their sides

        return side1.equals(((Rectangle) o).side1) &&
                side2.equals(((Rectangle) o).side2) &&
                side3.equals(((Rectangle) o).side3) &&
                side4.equals(((Rectangle) o).side4);
    }

    @Override
    public int hashCode() {
        double perimeter = calculatePerimeter();

        return (int) perimeter;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "perimeter='" + calculatePerimeter() + '\'' +
                "area='" + calculateArea() + '\'' +
                ", color='" + color +
                "'}";
    }
}
