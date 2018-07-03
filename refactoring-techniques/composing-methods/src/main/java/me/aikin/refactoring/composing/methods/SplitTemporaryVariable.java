package me.aikin.refactoring.composing.methods;

public class SplitTemporaryVariable {
    public void setPerimeterAndArea(double height, double width) {
        double temp = 2 * (height + width);
        setDoublePerimeter(temp);
        temp = height * width;
        setDoubleArea(temp);
    }

    private double doubleArea;

    private void setDoubleArea(double value) {
        doubleArea = value * 2;
    }

    public double getDoubleArea() {
        return doubleArea;
    }

    private double doublePerimeter;

    private void setDoublePerimeter(double value) {
        doublePerimeter = value * 2;
    }

    public double getDoublePerimeter() {
        return doublePerimeter;
    }
}
