package com.georgiev.module.app;

import com.georgiev.module.core.LargeShapeFactory;
import com.georgiev.module.core.ShapeFactory;
import com.georgiev.module.core.SmallShapeFactory;
import com.typesafe.config.Config;
import com.typesafe.config.ConfigException;
import com.typesafe.config.ConfigFactory;

public class Configurator {
	private final Config config;

	public Configurator() {
		// See src/main/resources/application.conf
		config = ConfigFactory.load();
	}

	public ShapeFactory newFactory() {
		String size = config.getString("size");
		if (size.equals("S")) {
			return new SmallShapeFactory();
		}
		else if (size.equals("L")) {
			return new LargeShapeFactory();
		}
		else {
			throw new ConfigException.BadValue("size", "Unsupported size: " + size);
		}
	}
}
