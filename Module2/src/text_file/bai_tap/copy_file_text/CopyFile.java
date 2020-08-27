package text_file.bai_tap.copy_file_text;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;



public class CopyFile {
	public static void main(String[] args) throws IOException {
		File file = new File("source.txt");
		FileWriter fileTarget = new FileWriter(Math.random()+"target.txt");
		FileReader fileReader=  new FileReader(file);
		BufferedReader reader = new BufferedReader(fileReader);
		String line= null;
		while(( line= reader.readLine()) != null) {
			System.out.println(line);
			fileTarget.write(line+"\n ");
		}
		fileReader.close();
		fileTarget.close();
	
	}


}
