package org.example.task2;

public class Box {
    private int height;
    private int width;
    private int length;

    public Box(int height, int width, int length) {
        setHeight(height);
        setWidth(width);
        setLength(length);
    }

    public int getVolume() {
        return height * width * length;
    }

    public int getLateralSurfaceArea() {
        return 2 * length * height + 2 * width * height;
    }

    public int getSurfaceArea() {
        return 2 * length * width + 2 * length * height + 2 * width * height;
    }

    private void setHeight(int height) {
        if (height > 0) this.height = height;
        else this.height = 1;
    }

    private void setWidth(int width) {
        if (width > 0) this.width = width;
        else this.width = 1;
    }

    private void setLength(int length) {
        if (length > 0) this.length = length;
        else this.length = 1;
    }
}
