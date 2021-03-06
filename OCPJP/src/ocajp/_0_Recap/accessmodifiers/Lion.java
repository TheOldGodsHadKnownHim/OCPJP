package ocajp._0_Recap.accessmodifiers;

import ocajp._0_Recap.cat.BigCat;

public class Lion extends BigCat {
	
public static void main(String[] args) {
		
		BigCat cat = new Lion();
		Lion lion = new Lion();
		/*
		 * name has a public access level and so is visible to
		 * any classes no matter what package they are declared
		 * in
		 */
		System.out.println(cat.name);
		/*
		 * hasFur has a protected access and in this instance
		 * it is being invoked on an instance of type BigCat
		 * and can therefore only be accessed if it is in the
		 * same package as BigCat 
		 */
		//System.out.println(cat.hasFur);
		System.out.println(lion.hasFur);


		/*
		 * hasPaws has a default access level and is therefore
		 * no longer visible as it now being accessed from a 
		 * class in a different package.
		 */
		//System.out.println(cat.hasPaws);

		/*
		 * Private variable can only be accessed by code in the 
		 * same class. 
		 */
		//System.out.println(cat.id);
		
	}
}
