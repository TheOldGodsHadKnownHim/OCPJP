package ocajp._0_Recap.accessmodifiers;

import ocajp._0_Recap.cat.BigCat;

public class Cat {
<<<<<<< HEAD

=======
	
>>>>>>> dev_keith
	public static void main(String[] args) {
		
		BigCat cat = new BigCat();

		/*
		 * name has a public access level and so is visible to
		 * any classes no matter what package they are declared
		 * in
		 */
		System.out.println(cat.name);
		/*
		 * hasFur has a protected access level and is therefore
		 * no longer visible as it now being accessed from a 
		 * class in a different package.
		 */
		System.out.println(cat.hasFur);
		/*
		 * hasPaws has a default access level and is therefore
		 * no longer visible as it now being accessed from a 
		 * class in a different package.
		 */
		System.out.println(cat.hasPaws);
		/*
		 * Private variable can only be accessed by code in the 
		 * same class. 
		 */
		System.out.println(cat.id);
	}

}
