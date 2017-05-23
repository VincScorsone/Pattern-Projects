package builder;

import orange.Orange;

public class BrasilianaOrangeBuilder implements OrangeBuilder{
	private Orange orange;
	
	public BrasilianaOrangeBuilder(){
		orange= new Orange();
	}

	@Override
	public Orange build() {
		return orange;
	}

	@Override
	public OrangeBuilder buildType() {
		orange.setType("brasiliana");
		return this;
	}

	@Override
	public OrangeBuilder buildColor() {
		orange.setColor("orange");
		return this;
	}

	@Override
	public OrangeBuilder buildSize() {
		orange.setSize("big");
		return this;
	}
	
	
}
