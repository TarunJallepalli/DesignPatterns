package com.tarunj.designpatterns.prototype;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class Rectangle extends Shape {

    private int length;
    private int width;

    public Rectangle() {}

    public Rectangle(Rectangle target) {

        super(target);
        if(Objects.nonNull(target)) {
            this.length = target.length;
            this.width = target.width;
        }
    }

    public Rectangle clone() {
        return new Rectangle(this);
    }

    @Override
    public boolean equals(Object obj) {

        if(!(obj instanceof Rectangle rectangle) || !super.equals(obj)) return false;
        return rectangle.width == width && rectangle.length == length;
    }
}
