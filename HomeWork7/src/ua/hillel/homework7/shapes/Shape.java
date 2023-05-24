package ua.hillel.homework7.shapes;

// Створити суперклас Shape, який буде містити в собі методи:
// calculateArea(), calculatePerimeter та paint().Та поле color;
public class Shape {

    public String color;

    public String shapeName;

    public double calculateArea() {
        return 0;

    }

    public double calculatePerimeter() {
        return 0;
    }

    /**
     * @param color - modern colors can be defined by any set of characters :( Girlish names like 'color of sea wave on sunset' are ok
     */
    public void paint(String color) {
        this.color = color;
    }

    public Shape() {
        color = "Transparent";
        shapeName = "Shape";
    }
}
