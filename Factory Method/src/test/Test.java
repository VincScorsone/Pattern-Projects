package test;

import factory.AppleFactory;
import factory.Factory;

public class Test {

	public static void main(String[] args) {
		Factory fact= new AppleFactory();
		fact.makeFruit().view();
	}

}
