package singleton;

public class AppleSingleton {
	private static AppleSingleton apple=null;
	
	private AppleSingleton(){
		
	}
	
	public static AppleSingleton getIstance(){
		if(apple==null)
			apple= new AppleSingleton();
		
		return apple;
	}
	
	public void view(){
		System.out.println("I'm appleSingleton, it's my hashcode: "+apple.hashCode());
	}
}
