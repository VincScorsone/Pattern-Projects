package test;


import prototype.Prototype;
import prototype.PrototypeManager;

public class Test {

	public static void main(String[] args) {
		PrototypeManager manager= new PrototypeManager();
		Prototype orange= manager.getProtoype("banana");
		orange.view();
		
	}

}
