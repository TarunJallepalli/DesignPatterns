package com.tarunj.designpatterns.prototype;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class Circle extends Shape {

    private int radius;

    public Circle() {}

    public Circle(Circle target) {

        super(target);
        if(Objects.nonNull(target)) {
            this.radius = target.radius;
        }
    }

    public Circle clone() {
        return new Circle(this);
    }

    @Override
    public boolean equals(Object obj) {

        if(!(obj instanceof Circle circle) || !super.equals(obj)) return false;
        return circle.radius == radius;
    }
}
