package com.georgiev.module.app;


import com.georgiev.module.core.Interactor;
import com.georgiev.module.core.ShapeFactory;
import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

public class Main {
	public static void main(String[] args) {
		Configurator configurator = new Configurator();
		ShapeFactory factory = configurator.newFactory();
		Interactor interactor = new Interactor(factory);
		interactor.businessLogic();
	}
}
