package ocpjp._5.string_processing;

class StringTest {
	public static void main(String[] args)
	{
		String s = "going";
		print(s,s = "gone");
		
		String s1 = "running";
		print(s1,s1.concat(s));
		print(s1,s1.substring(0, 3));

		
		String x = "Keith";//String with reference x 
		System.out.println(x);
		x.concat("ksdlskldlsk");//Value of x is immutable, so this concat won't change the value of x
		System.out.println(x);
		/*
		 * NB - A String is immutable but its reference is mutable. Here, the reference x is assigned a
		 * new value. x used to point at "Keith", but it now points at "Michelle". The "Keith" String 
		 * still exists in memory but it no longer has a reference that points to it. It will live in memory
		 * until such point as it gets garbage collected. 
		 */
		x = "Michelle";
		System.out.println(x);
		}

	static void print(String a, String b) {
		System.out.println(a + ", " + b);
	}
}
