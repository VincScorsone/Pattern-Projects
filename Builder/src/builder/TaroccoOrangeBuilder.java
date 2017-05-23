package builder;

import orange.Orange;

public class TaroccoOrangeBuilder implements OrangeBuilder {
	private Orange orange;
	
	public TaroccoOrangeBuilder(){
		orange= new Orange();
	}
	
	@Override
	public Orange build() {
		return orange;
	}

	@Override
	public OrangeBuilder buildType() {
		orange.setType("tarocco");
		return this;
	}

	@Override
	public OrangeBuilder buildColor() {
		orange.setColor("red");
		return this;
	}

	@Override
	public OrangeBuilder buildSize() {
		orange.setSize("medium");
		return this;
	}

}
