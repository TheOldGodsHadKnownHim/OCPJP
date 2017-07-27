package ocpjp._6.exceptions_and_assertions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


public class FileCopier {
	public static void copy(String records1, String records2) throws IOException {
		try (InputStream is = new FileInputStream(records1);
				OutputStream os = new FileOutputStream(records2);) {
			byte[] buffer = new byte[1024];
			int bytesRead = 0;
			while ((bytesRead = is.read(buffer)) != -1) {
				os.write(buffer, 0, bytesRead);
				System.out.println("Read and written bytes " + bytesRead);
				}
			} catch (IOException | IndexOutOfBoundsException e) {
				//e = new FileNotFoundException();
				e.printStackTrace();
				}
		}
	public static void main(String[] args) throws Exception {
		copy("/temp/testCopy.txt", "/temp/testCopy2.txt");
		}
	}
