package ua.hillel.homework7.shapes;


public class Segment {
    Point p1, p2;

    /**
     * @param p1 - start point
     * @param p2 - end point
     */
    public Segment(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    // Calculates length of the segment between two points
    public double length() {
        double xLength = Math.abs(p1.x - p2.x);
        double yLength = Math.abs(p1.y - p2.y);

        return Math.sqrt(xLength * xLength + yLength * yLength);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        // Comparison
        // By radius
        return length() == ((Segment) o).length();
    }

    @Override
    public int hashCode() {

        return (int) length();
    }
}
