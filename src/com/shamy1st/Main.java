package com.shamy1st;

import com.shamy1st.factory.Shape;
import com.shamy1st.factory.ShapeFactory;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape1.draw();
        shape2.draw();
    }
}
