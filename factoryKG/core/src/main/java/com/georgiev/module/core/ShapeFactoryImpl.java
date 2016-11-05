package com.georgiev.module.core;

import com.georgiev.module.Shape;
import com.georgiev.module.ShapeFactory;

public class ShapeFactoryImpl implements ShapeFactory {

  public Shape makeSquare() {
    return new Square();
  }

  public Shape makeCircle() {
    return new Circle();
  }

}
