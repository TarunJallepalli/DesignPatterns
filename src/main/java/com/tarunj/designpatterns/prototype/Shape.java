package com.tarunj.designpatterns.prototype;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public abstract class Shape {

    private int x;
    private int y;
    private String color;

    public Shape() {}

    public Shape(Shape target) {

        if(Objects.nonNull(target)) {
            this.x = target.x;
            this.y = target.y;
            this.color = target.color;
        }
    }

    public abstract Shape clone();

    @Override
    public boolean equals(Object obj) {

        if(!(obj instanceof Shape shape)) return false;
        return shape.x == x && shape.y == y && shape.color.equals(color);
    }
}
