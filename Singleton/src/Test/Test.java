package Test;

import singleton.AppleSingleton;

public class Test {

	public static void main(String[] args) {
		AppleSingleton istance= AppleSingleton.getIstance();
		istance.view();
		AppleSingleton istance2= AppleSingleton.getIstance();
		istance2.view();
	}

}
