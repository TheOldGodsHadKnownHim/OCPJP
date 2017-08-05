package ocajp._0_Recap.accessmodifiers;

import ocajp._0_Recap.cat.BigCat;

public class ProtectedTest {

	public static void main(String[] args) {

		BigCat bigCat = new BigCat();
		
		System.out.println(bigCat.name);

		//This will not compile because hasFur has protected level access and can only be accessed 
//from the same package or from a subclass in a different package. ProtectedTest is not a subclass of BigCat,
//and it is also located in a different package
		//System.out.print(bigCat.hasFur);
	}

}
