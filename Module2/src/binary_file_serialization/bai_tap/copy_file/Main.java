package binary_file_serialization.bai_tap.copy_file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Main {

	public static void main(String[] args) {
		try (
	            InputStream inputStream = new FileInputStream("sourceFile.txt");
	            OutputStream outputStream = new FileOutputStream("targetFile.txt");
	        ) {
	 
	            int byteRead;
	            int count=0;
	            while ((byteRead = inputStream.read()) != -1) {
	                outputStream.write(byteRead);
	                count ++;
	            }
	            
	            System.out.println("number of byte: "+count);
	            System.out.println("completely copy");
	        } catch (IOException ex) {
	            ex.printStackTrace();
	        }

	}

}
