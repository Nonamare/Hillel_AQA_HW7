package ua.hillel.homework7.shapes;

public class Triangle extends Shape {

    private Point p1, p2, p3;
    public Segment side1, side2, side3;

    /**
     * @param apex1 - first apex
     * @param apex2 - second apex
     * @param apex3 - third apex
     */
    public Triangle(Point apex1, Point apex2, Point apex3) {
        p1 = apex1;
        p2 = apex2;
        p3 = apex3;

        side1 = new Segment(p1, p2);
        side2 = new Segment(p2, p3);
        side3 = new Segment(p3, p1);

        color = "Transparent";

        shapeName = "Triangle";
    }

    @Override
    public double calculatePerimeter() {
        // For debugging purposes I do it step-by-step

        double perimeter = side1.length();
        perimeter += side2.length();
        perimeter += side3.length();

        return perimeter;
    }

    @Override
    public double calculateArea() {
        /*
         Use Heron's formula - https://www.cuemath.com/measurement/area-of-triangle/
         Area = √ s ( s − a ) ( s − b ) ( s − c )
         where s is semi-perimeter
         */

        double s = this.calculatePerimeter() / 2;
        double almostArea = s * (s - side1.length()) * (s - side2.length()) * (s - side3.length());
        return Math.sqrt(almostArea);
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
        // By two sides

        return side1.equals(((Triangle) o).side1) &&
                side2.equals(((Triangle) o).side2) &&
                side3.equals(((Triangle) o).side3);
    }

    @Override
    public int hashCode() {
        double perimeter = calculatePerimeter();

        return (int) perimeter;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "perimeter='" + calculatePerimeter() + '\'' +
                "area='" + calculateArea() + '\'' +
                ", color='" + color +
                "'}";
    }
}
