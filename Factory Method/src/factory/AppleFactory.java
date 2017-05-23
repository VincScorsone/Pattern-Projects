package factory;

import objects.Apple;
import objects.Fruit;

public class AppleFactory implements Factory {

	@Override
	public Fruit makeFruit() {
		return new Apple();
	}


}
