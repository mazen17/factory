package com.georgiev.module.core;

import com.georgiev.module.core.SmallCircle;
import com.georgiev.module.core.Shape;
import com.georgiev.module.core.ShapeFactory;
import com.georgiev.module.core.SmallSquare;

public class SmallShapeFactory implements ShapeFactory {

  public Shape makeSquare() {
    return new SmallSquare();
  }

  public Shape makeCircle() {
    return new SmallCircle();
  }

}
