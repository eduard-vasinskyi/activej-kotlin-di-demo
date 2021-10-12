package me.evasinskyi;

import io.activej.inject.annotation.ProvidesIntoSet;
import io.activej.inject.module.AbstractModule;

public class JavaModule extends AbstractModule {

	@ProvidesIntoSet
	Hej javaHej() {
		return new Hej("Java");
	}
}
