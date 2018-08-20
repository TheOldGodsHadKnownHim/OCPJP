package ocpjp._8.input_output_file;

public class FileSeperator {

	public static void main(String[] args) {
		
		// would require a property value to be set
		System.out.println(System.getProperty("file.seperator"));
		
		System.out.println(java.io.File.separator);
	}

}
