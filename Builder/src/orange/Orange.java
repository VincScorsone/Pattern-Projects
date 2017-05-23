package orange;

public class Orange {
	private String type;
	private String color;
	private String size;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	
	@Override
	public String toString() {
		return "Orange [type=" + type + ", color=" + color + ", size=" + size + "]";
	}
	
	
	
}
