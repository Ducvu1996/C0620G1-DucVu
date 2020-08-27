package binary_file_serialization.thuc_hanh.copy_file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class Main {

	public static void main(String[] args) {

		File sourceFile = new File("source.txt");
		File destFile = new File("destination.txt");

		try {
			copyFileUsingJava7Files(sourceFile, destFile);
	
			copyFileUsingStream(sourceFile, destFile);
			System.out.printf("Copy completed");
		} catch (IOException ioe) {
			System.out.printf("Can't copy that file");
			System.out.printf(ioe.getMessage());
		}

	}
	 private static void copyFileUsingJava7Files(File source, File dest) throws IOException {                             
	      Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
	 }
	 private static void copyFileUsingStream(File source, File dest) throws IOException {
			InputStream is = null;
			OutputStream os = null;
			try {
				is = new FileInputStream(source);
				os = new FileOutputStream(dest);
				byte[] buffer = new byte[1024];
				int length;
				while ((length = is.read(buffer)) > 0) {
				os.write(buffer, 0, length);
				}
			} finally {
				is.close();
				os.close();
			}
		}
}
