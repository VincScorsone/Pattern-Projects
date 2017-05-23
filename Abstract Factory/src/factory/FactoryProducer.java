package factory;

public class FactoryProducer {

	public static Factory getFactory(String type) {
		if(type.equals("orange"))
			return new OrangeFactory();
		else if(type.equals("apple"))
			return new AppleFactory();
		
		return null;
	}

}
