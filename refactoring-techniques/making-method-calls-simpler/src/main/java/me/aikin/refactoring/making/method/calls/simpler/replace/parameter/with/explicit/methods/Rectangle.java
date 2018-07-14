package me.aikin.refactoring.making.method.calls.simpler.replace.parameter.with.explicit.methods;

public class Rectangle {
    private int width;
    private int height;

    public void setValue(String name, int value) {
        if (name.equals("height"))
            height = value;
        if (name.equals("width"))
            width = value;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
