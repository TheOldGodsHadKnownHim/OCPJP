package ocpjp._4.generics_and_collections_comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ObjectComparisonProgram {

	public static void main(String[] args) {

		List <Duck> ducks = new ArrayList<>();
		ducks.add(new Duck("Wilf"));
		ducks.add(new Duck("Waif"));
		ducks.add(new Duck("WILF"));
		ducks.add(new Duck("Alan"));
		System.out.println(ducks);
		Collections.sort(ducks);
		System.out.println(ducks);
		
		List <Dog> dogs = new ArrayList<>();
		dogs.add(new Dog("Wilf", 3));
		dogs.add(new Dog("Wilf", 1));
		dogs.add(new Dog("Alan", 4));
		dogs.add(new Dog("Waif", 2));
		Collections.sort(dogs);
		System.out.println(dogs);
		System.out.println(dogs.get(2).equals(dogs.get(3)));//prints true
		System.out.println(dogs.get(2).compareTo(dogs.get(3)));//prints 0
		
		/*
		 * I'd like to sort the same group of dogs by id
		 */
		Comparator <Dog> byId = new Comparator<Dog>() {
			public int compare(Dog dog1, Dog dog2){
				return dog1.getId() - dog2.getId();
			}
		};
		
		Collections.sort(dogs, byId);
		System.out.println(dogs);
		
		System.out.println(Collections.binarySearch(dogs, dogs.get(0)));//prints 2
	}
}
