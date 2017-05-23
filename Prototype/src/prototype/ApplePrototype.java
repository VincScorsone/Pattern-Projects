package prototype;

public class ApplePrototype implements Prototype {
	private String name="apple";
	
	@Override
	public Prototype clone() {
		return new ApplePrototype();
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void view(){
		System.out.println("I'm a "+this.getName());

	}

}