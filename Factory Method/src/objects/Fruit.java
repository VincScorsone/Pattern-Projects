package objects;

public abstract class Fruit {
	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public void view(){
		System.out.println("I'm a "+this.getType());
	}
}
