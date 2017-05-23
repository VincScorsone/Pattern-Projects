package builder;

import orange.Orange;

public class NavelinaOrangeBuilder implements OrangeBuilder {
	private Orange orange;
	
	public NavelinaOrangeBuilder(){
		orange= new Orange();
	}

	@Override
	public Orange build() {
		return orange;
	}

	@Override
	public OrangeBuilder buildType() {
		orange.setType("navelina");
		return this;
	}

	@Override
	public OrangeBuilder buildColor() {
		orange.setColor("orange");
		return this;
	}

	@Override
	public OrangeBuilder buildSize() {
		orange.setSize("small");
		return this;
	}

}
