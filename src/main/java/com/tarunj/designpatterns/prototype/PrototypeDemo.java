package com.tarunj.designpatterns.prototype;

import java.util.ArrayList;
import java.util.List;

public class PrototypeDemo {

    public static void main(String[] args) {

        List<Shape> shapes = getShapes();
        List<Shape> shapesCopy = shapes.stream().map(Shape::clone).toList();

        for(int i = 0; i < shapes.size(); i++) {

            if(shapes.get(i) == shapesCopy.get(i)) {
                System.out.println("Both are same Objects");
            }
            else if(shapes.get(i).equals(shapesCopy.get(i))){
                System.out.println("Objects are not same, but are clones");
            }
            else {
                System.out.println("Objects are not similar");
            }
        }
    }

    private static List<Shape> getShapes() {

        List<Shape> shapes = new ArrayList<>();

        Circle circlePrototype = new Circle();
        circlePrototype.setX(0);
        circlePrototype.setY(100);
        circlePrototype.setRadius(10);
        circlePrototype.setColor("Green");

        Rectangle rectanglePrototype = new Rectangle();
        rectanglePrototype.setX(50);
        rectanglePrototype.setY(50);
        rectanglePrototype.setColor("Blue");
        rectanglePrototype.setLength(10);
        rectanglePrototype.setWidth(8);

        shapes.add(circlePrototype);
        shapes.add(rectanglePrototype);
        return shapes;
    }
}
