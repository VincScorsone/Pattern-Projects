package builder;

import orange.Orange;

public interface OrangeBuilder {
	public Orange build();
	public OrangeBuilder buildType();
	public OrangeBuilder buildColor();
	public OrangeBuilder buildSize();
}
