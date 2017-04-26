package ocpjp._5.string_processing;

public class StringBuilder_example1 {
	
	public static void main(String[] args) {
		
		/*
		 * APPEND
		 */
		StringBuilder sb = new StringBuilder("abc");
		sb.append("def");
		//StringBuilder is not immutable so the object value will actually be modified
		System.out.println("sb = " + sb);//prints abcdef
			
		/*
		 * DELETE
		 */
		sb.delete(4,5);
		System.out.println("sb = " + sb);//prints abcdf
		
		sb.delete(1,1);
		System.out.println("sb = " + sb);//prints abcdf
		/*
		 * INSERT
		 */
		sb.insert(4, "e");
		System.out.println("sb = " + sb);//prints abcdef

		/*
		 * REVERSE
		 */
		sb.reverse();
		System.out.println("sb = " + sb);//prints fedcba
	}

}
