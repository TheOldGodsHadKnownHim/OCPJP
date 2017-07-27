package ocpjp._1.java_class_design;

public class SubClass extends SuperClass {
	
	int i, j, k;
	
	public SubClass( int m, int n, int o ){
	this.i=m;
	this.j=n;
	this.k=o;
		}

	public SubClass( int m, int n ){
	super(m,n);
		}

	public SubClass( int m ){
		super(m);
		}
}
