package com.georgiev.module.core;

import com.georgiev.module.core.LargeCircle;
import com.georgiev.module.core.LargeSquare;
import com.georgiev.module.core.Shape;
import com.georgiev.module.core.ShapeFactory;
import com.georgiev.module.core.SmallCircle;
import com.georgiev.module.core.SmallSquare;

public class LargeShapeFactory implements ShapeFactory {

  public Shape makeSquare() {
    return new LargeSquare();
  }

  public Shape makeCircle() {
    return new LargeCircle();
  }

}
