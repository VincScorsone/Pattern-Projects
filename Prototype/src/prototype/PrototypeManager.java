package prototype;

import java.util.ArrayList;

public class PrototypeManager {
	private static ArrayList<Prototype> list= new ArrayList<Prototype>();
	
	public PrototypeManager(){
		list.add(new ApplePrototype());
		list.add(new OrangePrototype());
	}
	
	public Prototype getProtoype(String type){
		for(Prototype p: list)
			if(p.getName().equals(type))
				return p.clone();
		
		System.err.println("Not exist!");
		return null;
		
	}
	
	public void addPrototype(Prototype p){
		if(list.contains(p))
			System.err.println("Prototype is already exists!");
		else
			list.add(p);
	}
}
