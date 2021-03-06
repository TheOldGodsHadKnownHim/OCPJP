package ocajp._0_Recap.cat;

import ocajp._0_Recap.accessmodifiers.Lion;

public class CatAdmirer {

	public static void main(String[] args) {
		
		BigCat cat = new BigCat();
		
		Lion lion = new Lion();
		//will print no problem because a Lion is a BigCat and BigCat is in this package
		System.out.println(lion.hasFur);

		/*
		 * name has a public access level and so is visible to
		 *  any classes no matter what package they are declared
		 *  in
		 */
		System.out.println(cat.name);
		/*
		 * hasFur has a protected access level and so is visible
		 *  to any classes within the same package.
		 */
		System.out.println(cat.hasFur);
		/*
		 * hasPaws has a default access level and so is visible 
		 * to any classes within the same package
		 */
		System.out.println(cat.hasPaws);
		/*
		 * The attempt to access the id variable on the cat instance
		 *  will cause a compilation error as id has been has an 
		 *  access level of private. Without a getter method, 
		 *  a private variable can only be accessed by code in the 
		 *  same class. 
		 */
		//System.out.println(cat.id);
	}

}
