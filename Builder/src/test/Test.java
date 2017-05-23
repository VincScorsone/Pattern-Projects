package test;

import builder.BuilderDirector;

public class Test {

	public static void main(String[] args) {
		BuilderDirector director = new BuilderDirector("navelina");
		System.out.println(director.getBuilder().build());
	}

}
