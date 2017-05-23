package factory;

import objects.Fruit;
import objects.Orange;

public class OrangeFactory implements Factory {

	@Override
	public Fruit makeFruit() {
		return new Orange();
	}



}
