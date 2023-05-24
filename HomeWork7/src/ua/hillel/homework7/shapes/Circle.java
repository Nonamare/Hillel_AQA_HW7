package ua.hillel.homework7.shapes;

public class Circle extends Shape {
    private Point centerPoint, circlePoint;
    public Segment radius;

    /**
     * @param centerPoint - center point
     * @param circlePoint - point on a circle
     */
    public Circle(Point centerPoint, Point circlePoint) {
        this.centerPoint = centerPoint;
        this.circlePoint = circlePoint;

        radius = new Segment(centerPoint, circlePoint);

        color = "Transparent";

        shapeName = "Circle";
    }

    @Override
    public double calculateArea() {
        // A = πr2
        double area = Math.PI * radius.length() * radius.length();
        return area;

    }

    @Override
    public double calculatePerimeter() {
        // p = 2πr
        double perimeter = 2 * Math.PI * radius.length();
        return perimeter;
    }

    @Override
    public void paint(String color) {
        this.color = color;
        //System.out.println(shapeName + " now is " + color);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        // Comparison
        // By radius
        return radius.equals(((Circle) o).radius);
    }

    @Override
    public int hashCode() {

        return radius.hashCode();
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius='" + radius.length() + '\'' +
                ", color='" + color +
                "'}";
    }


}
