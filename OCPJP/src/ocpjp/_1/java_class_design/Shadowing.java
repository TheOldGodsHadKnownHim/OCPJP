package ocpjp._1.java_class_design;

public class Shadowing {
	
	public static void main(String [] args){
		A o1 = new C( );
		System.out.println(o1 instanceof C);

		B o2 = (B) o1;
		System.out.println(o1.m1( ) );
		/*
		 * Which variable will be used depends on the class that the variable is declared of, which in
		 * this case is class B
		 */
		System.out.println(o2.i );
		/*
		 * Which method will be used depends on the actual class of the object that is referenced by
		 * the variable - in this case the class is C
		 */
		System.out.println(o2.m1());
		System.out.println(o2 instanceof C);
		}
	}
class A {
	int i = 10;
	int m1( ) { 
		return i; 
		} 
	} 

class B extends A {
	int i = 20;
	int m1() { 
		return i; 
		} 
	} 

class C extends B { 
	int i = 30;
	int m1() { 
		return i; 
		} 
	} 
