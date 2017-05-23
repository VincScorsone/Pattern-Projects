package builder;

public class BuilderDirector {
	private OrangeBuilder builder;
	
	public BuilderDirector(String type){
		if(type.equals("brasiliana"))
			builder= new BrasilianaOrangeBuilder();
		else if(type.equals("navelina"))
			builder= new NavelinaOrangeBuilder();
		else if(type.equals("tarocco"));
			builder= new  TaroccoOrangeBuilder();
			
		this.construct();
	}
	
	public void construct(){
		builder.buildColor().buildSize().buildType();
	}
	
	public OrangeBuilder getBuilder(){
		return builder;
	}
}
