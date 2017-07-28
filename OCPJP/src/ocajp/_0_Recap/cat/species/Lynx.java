package ocajp._0_Recap.cat.species;

import ocajp._0_Recap.cat.BigCat;

public class Lynx extends BigCat {

	public static void main(String[] args) {
		
		BigCat cat = new BigCat();

		System.out.println(cat.name);
		//being accessed by the variable so does not benefit from protected access and will cause compi
		//lation error
//		System.out.println(cat.hasFur);
//		System.out.println(cat.hasPaws);
//		System.out.println(cat.id);
		
		Lynx lynx = new Lynx();
		
		System.out.println(lynx.name);
		//being accessed using ineritance so does benefit from protected access
		System.out.println(lynx.hasFur);
		//compilation error for these 2
//		System.out.println(lynx.hasPaws);
//		System.out.println(lynx.id);
	}

}
