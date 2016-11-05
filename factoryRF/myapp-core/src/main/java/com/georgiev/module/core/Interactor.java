package com.georgiev.module.core;

public class Interactor {
	private final ShapeFactory factory;

	public Interactor(ShapeFactory factory) {
		this.factory = factory;
	}

	public void businessLogic() {
		Shape square = factory.makeSquare();
		Shape circle = factory.makeCircle();
		System.out.println(circle.getShape());
		System.out.println(square.getShape());
	}

}
