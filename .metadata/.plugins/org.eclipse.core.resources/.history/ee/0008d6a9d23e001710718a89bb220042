package prototype;

public class OrangePrototype implements Prototype {
	private String name = "orange";
	
	@Override
	public Prototype clone() {
		return new OrangePrototype();
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void view() {
		System.out.println("I'm a "+this.getName());
	}

}
