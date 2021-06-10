package org.vulcan.light.designpattern.creational.prototype.example;

/**
 * @author Sam Lu
 * @date 2021/6/10
 */
public class Rectangle extends Shape {

    public int width;
    public int height;

    public Rectangle() {

    }

    public Rectangle(Rectangle source) {
        super(source);
        if (source != null) {
            this.width = source.width;
            this.height = source.height;
        }
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Rectangle) || !super.equals(object)) {
            return false;
        }
        Rectangle rectangle = (Rectangle) object;
        return width == rectangle.width && height == rectangle.height;
    }

}
