package com.georgiev.module.app;

import com.georgiev.module.Shape;
import com.georgiev.module.ShapeFactory;
import com.georgiev.module.core.ShapeFactoryImpl;

public class App {

  public static void main(String[] args) {
    ShapeFactory sf = new ShapeFactoryImpl();
    Shape square = sf.makeSquare();
    Shape circle = sf.makeCircle();
    System.out.println(circle.getShape());
    System.out.println(square.getShape());

  }
}
