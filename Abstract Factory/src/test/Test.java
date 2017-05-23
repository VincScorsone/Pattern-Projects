package test;

import factory.Factory;
import factory.FactoryProducer;

public class Test {

	public static void main(String[] args) {
		Factory fact= FactoryProducer.getFactory("apple");
		fact.makeFruit().view();
		fact.makeTree().view();
	}

}
